inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = "x11 wayland"

RDEPENDS:${PN} = " \
        qtbase \
        qtmultimedia \
        qtwayland \
        qtsystems \
        qtconnectivity \
        python3-pyqt5 \
"

