DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=9d7780acc19bb1483beb724d32e59bef"
SRCNAME = "catkin_pkg"

SRC_URI = "http://pypi.python.org/packages/source/c/catkin_pkg/catkin_pkg-0.1.11.tar.gz"
SRC_URI[md5sum] = "c5aea539db4326e510fe8f1674c27424"
SRC_URI[sha256sum] = "a8cff395743832a76c728fd818de15aee1970ef0f46c7a46d679f7caf83ef4c4"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

DEPENDS += "python"
DEPENDS_class-native  += "python-native"
BBCLASSEXTEND = "native"
