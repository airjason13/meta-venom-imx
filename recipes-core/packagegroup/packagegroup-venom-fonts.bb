SUMMARY = "All fonts packages required for a base installation of VXFCE"
SECTION = "x11/wm"
PR = "r5"

# librsvg-gtk gets debian renamed to librsvg-2-gtk
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = " x11 wayland "

RDEPENDS:${PN} = " \
    source-han-sans-cn-fonts \
    source-han-sans-jp-fonts \
    source-han-sans-kr-fonts \
    source-han-sans-tw-fonts \
"

