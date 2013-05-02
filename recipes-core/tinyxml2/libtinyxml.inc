DESCRIPTION = "TinyXML is a simple, small, efficient, C++ XML parser that can be easily integrated into other programs."
SECTION = "libs"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

inherit cmake

MAJ_VER ?= "2"
MIN_VER ?= "6"
BLD_VER ?= "0"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/leethomason/tinyxml2.git"

S = "${WORKDIR}/git"

OECMAKE_SOURCEPATH = ".."
OECMAKE_BUILDPATH = "${S}/build"
EXTRA_OECONF += "-C ${OECMAKE_BUILDPATH}"

do_configure_prepend() {
    pwd
    echo -e "${MAJ_VER}\n${MIN_VER}\n${BLD_VER}\n" | python setversion.py
}

PKG_${PN} = "${PN}${PV}"
PKG_${PN}-dbg = "${PN}${PV}-dbg"
PKG_${PN}-dev = "${PN}-dev"
PKG_${PN}-staticdev = "${PN}-staticdev"
PKG_${PN}-doc = "${PN}-doc"
