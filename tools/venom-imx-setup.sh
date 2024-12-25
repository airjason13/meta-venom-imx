#!/bin/sh

# echo $1
# echo $@
# MACHINE=lec-imx8mp
# DISTRO=fsl-imx-xwayland

CWD=$(pwd)
ADLINK_PROGRAM="$CWD/adlink-imx-setup-release.sh"

MACHINE=lec-imx8mp DISTRO=fsl-imx-xwayland source $ADLINK_PROGRAM $@

cp ../venom_local.conf conf/local.conf
cp ../sources/meta-venom-imx/qt5_layer_config/qt5_layer.conf ../sources/meta-qt5/conf/layer.conf

echo "BBLAYERS += \"\${BSPDIR}/sources/meta-qt5\"" >> ./conf/bblayers.conf
echo "BBLAYERS += \"\${BSPDIR}/sources/meta-swupdate\"" >> ./conf/bblayers.conf
echo "BBLAYERS += \"\${BSPDIR}/sources/meta-venom-imx\"" >> ./conf/bblayers.conf
