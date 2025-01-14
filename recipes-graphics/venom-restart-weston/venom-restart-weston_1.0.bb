LICENSE = "CLOSED"

inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "venom_weston.service"

SRC_URI:append = " file://venom_weston.service \
                   file://venom_weston_restart.sh \
                    "
FILES:${PN} += "${systemd_unitdir}/system/venom_weston.service"

do_install:append() {
    install -d ${D}/${systemd_unitdir}/system
    install -d ${D}/${bindir}
    install -m 0644 ${WORKDIR}/venom_weston.service ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/venom_weston_restart.sh ${D}/${bindir}
}

