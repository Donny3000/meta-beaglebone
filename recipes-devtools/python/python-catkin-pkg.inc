DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD;md5=3775480a712fc46a69647678acb234cb"
SRCNAME = "catkin_pkg"

SRC_URI = "http://pypi.python.org/packages/source/c/catkin_pkg/catkin_pkg-${PV}.tar.gz"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

DEPENDS += "python"
DEPENDS_class-native  += "python-native"
BBCLASSEXTEND = "native"
