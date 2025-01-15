FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# EXTRA_SRC = "${@d.getVarFlag('KERNEL_SRC_PATCHES', d.getVar('MACHINE'), True)}"
SRC_URI += "file://0004-drm_probe_helper.c-Add-no-edid-resolutions.patch"

