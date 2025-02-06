inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = "x11 wayland"

RDEPENDS:${PN} = " \
         python3-pyqtgraph \
         python3-astral \
         python3-flask-fontawesome \
         python3-flask-qrcode \
         python3-hurry-filesize \
         python3-pyudev \
         python3-qdarkstyle \
         python3-qtpy \
         python3-qtmodern \
         python3-requests \
         python3-psutil \
         python3-numpy \
         python3-pillow \
         python3-flask \
         python3-qrcode \
         python3-pytz \
         python3-jinja2 \
         python3-markupsafe \
         python3-werkzeug \
         python3-click \
         python3-itsdangerous \
         python3-flask-wtf \
"

