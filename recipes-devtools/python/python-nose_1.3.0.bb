DESCRIPTION = "nose extends unittest to make testing easier"
SECTION = "devel/python"
LICENSE = "LPGL-2.1"
LIC_FILES_CHKSUM = "file://lgpl.txt;md5=a6f89e2100d9b6cdffcea4f398e37343"

SRCNAME = "nose"

SRC_URI = "http://pypi.python.org/packages/source/n/nose/nose-1.3.0.tar.gz"
SRC_URI[md5sum] = "95d6d32b9d6b029c3c65674bd9e7eabe"
SRC_URI[sha256sum] = "4e63cc3325de75cf98ffad40be72fa69753de824695173178f74c034fe4f5260"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

DEPENDS += "python"
DEPENDS_class-native  += "python-native"
BBCLASSEXTEND = "native"

