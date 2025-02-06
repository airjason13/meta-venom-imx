
SUMMARY = "A simple Python wrapper for FFmpeg"
HOMEPAGE = "https://github.com/Ch00k/ffmpy"
AUTHOR = "Andrii Yurchuk <ay@mntw.re>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=24cc73fd46d6e0f81933ac8bd12ec1df"

SRC_URI = "https://files.pythonhosted.org/packages/4d/66/5697a7421c418ccbfae87b7e6503b480070f7cb16c25c77201afc6246348/ffmpy-0.5.0.tar.gz"
SRC_URI[md5sum] = "119da089f6c90e30e27add1012a99829"
SRC_URI[sha256sum] = "277e131f246d18e9dcfee9bb514c50749031c43582ce5ef82c57b51e3d3955c3"

S = "${WORKDIR}/ffmpy-0.5.0"

RDEPENDS_${PN} = ""

inherit setuptools3
