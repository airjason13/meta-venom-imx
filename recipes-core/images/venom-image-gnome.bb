# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "NXP Image to validate i.MX machines. \
This image contains everything used to test i.MX machines including GUI, \
demos and lots of applications. This creates a very large image, not \
suitable for production."
LICENSE = "MIT"

inherit core-image

### WARNING: This image is NOT suitable for production use and is intended
###          to provide a way for users to reproduce the image used during
###          the validation process of i.MX BSP releases.

## Select Image Features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    tools-sdk \
    package-management \
    splash \
    nfs-client \
    tools-debug \
    ssh-server-dropbear \
    hwcodecs \
"

V2X_PKGS = ""
V2X_PKGS:mx8dxl-nxp-bsp = "packagegroup-imx-v2x"

DOCKER ?= ""
DOCKER:mx8-nxp-bsp = "docker"

G2D_SAMPLES              = ""
G2D_SAMPLES:imxgpu2d     = "imx-g2d-samples"
G2D_SAMPLES:mx93-nxp-bsp = "imx-g2d-samples"

PACKAGECONFIG:append:pn-wireshark = " qt5 "

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-vweston \
    packagegroup-gnome-desktop \
    packagegroup-gnome-apps \
    packagegroup-core-full-cmdline \
    firmwared \
    ffmpeg \
    wireshark \
"

DISTRO_FEATURES:remove = "x11"

# PACKAGE_EXCLUDE:pn-core-image-vgnome += "weston-init"
PACKAGE_EXCLUDE += "weston-init"

