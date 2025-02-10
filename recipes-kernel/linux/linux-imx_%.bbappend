FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# EXTRA_SRC = "${@d.getVarFlag('KERNEL_SRC_PATCHES', d.getVar('MACHINE'), True)}"
SRC_URI += "file://0004-drm_probe_helper.c-Add-no-edid-resolutions.patch \
            file://venom_defconfig \
            "

# KBUILD_DEFCONFIG_lec-imx8mp = "${WORKDIR}/defconfig"

do_copy_venom_defconfig () {
    bbnote "Venom test copy def_config"
    cp -f ${WORKDIR}/venom_defconfig ${S}/arch/arm64/configs/lec-imx8mp_defconfig
}

# addtask copy_venom_defconfig before do_validate_branches after do_copy_source
addtask copy_venom_defconfig before do_copy_defconfig after do_copy_source

