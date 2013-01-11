DESCRIPTION = "Eigen is a C++ template library for linear algebra: matrices, vectors, numerical solvers, and related algorithms."
HOMEPAGE = "http://http://eigen.tuxfamily.org"
SECTION = "libs"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-3.0;md5=bfccfe952269fff2b407dd11f2f3083b"

SRC_URI = "http://bitbucket.org/eigen/eigen/get/2.0.17.tar.bz2"
SRC_URI[md5sum] = "2dfd1e2765d82c306adbfcd6a0eb324b"
SRC_URI[sha256sum] = "7255e856ed367ce6e6e2d4153b0e4e753c8b8d36918bf440dd34ad56aff09960" 

S = "${WORKDIR}"

EXTRA_OECMAKE = ""

inherit distutils-base pkgconfig cmake

