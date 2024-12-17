FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"


SRC_URI += " file://venom-weston.ini \
    file://venom-weston.service \
    file://tls.crt \
    file://tls.csr \
    file://tls.key \
            "

# Set password generated by:
# mkpasswd -m sha256crypt weston
# WESTONPASSWD = "\$5\$409x651F5vyY1.4o\$Iuplll7/qNSEcflYNjH..0zwylmyLsbZdZGS6hBcro5"


# mkpasswd -m sha256crypt workout13
WESTONPASSWD = "\$5\$p3uoV5VM5xZdWbJa\$Ste1aJDRFxUpmT7CYbte/ZXo3kqTouuQc5yBrf09Rq1"

USERADD_PARAM:${PN} = "--home /home/weston --shell /bin/sh --user-group -G video,input,render,wayland -p '${WESTONPASSWD}' weston"

do_install:append(){
    install -m 0755 -d ${D}${sysconfdir}/vnc/keys/
    chown weston:weston ${D}${sysconfdir}/vnc/keys/
    install -m 0666 ${WORKDIR}/tls.crt ${D}${sysconfdir}/vnc/keys/tls.crt
    install -m 0666 ${WORKDIR}/tls.csr ${D}${sysconfdir}/vnc/keys/tls.csr
    install -m 0666 ${WORKDIR}/tls.key ${D}${sysconfdir}/vnc/keys/tls.key
    
    
    install -m 0755 -d ${D}${sysconfdir}/xdg/weston/
    install ${WORKDIR}/venom-weston.ini ${D}${sysconfdir}/xdg/weston/weston.ini
    install -m 0755 -d ${D}${libdir}/systemd/system/
    install -D -p -m0644 ${WORKDIR}/venom-weston.service ${D}${systemd_system_unitdir}/weston.service
}



FILES:${PN} += "\
    ${sysconfdir}/vnc/keys \
    ${sysconfdir}/xdg/weston/ \
    ${libdir}/systemd/system/ \
"
