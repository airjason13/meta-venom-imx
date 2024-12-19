
inherit cmake

PACKAGECONFIG[noqt6] = "-DUSE_qt6=OFF,-DUSE_qt6=OFF, "

EXTRA_OECMAKE += "-DUSE_qt6=OFF "

