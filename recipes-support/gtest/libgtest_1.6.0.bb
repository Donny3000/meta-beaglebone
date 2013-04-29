DESCRIPTION = "Google's framework for writing C++ tests on a variety of platforms (Linux, Mac OS X, Windows, Cygwin, Windows CE, and Symbian). Based on the xUnit architecture. Supports automatic test discovery, a rich set of assertions, user-defined assertions, death tests, fatal and non-fatal failures, value- and type-parameterized tests, various options for running the tests, and XML test report generation."
SECTION = "devlopment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://googletest.googlecode.com/files/gtest-${PV}.zip"

S = "${WORKDIR}/gtest-${PV}"

SRC_URI[md5sum] = "4577b49f2973c90bf9ba69aa8166b786"
SRC_URI[sha256sum] = "5ec97df8e75b4ee796604e74716d1b50582beba22c5502edd055a7e67a3965d8"

do_install() {
    install -d ${D}${includedir}/gtest
    cp -a ${S}/include/gtest/* ${D}${includedir}/gtest

    install -d ${D}${docdir}/libgtest-dev/examples/samples
    cp -a ${S}/samples/* ${D}${docdir}/libgtest-dev/examples/samples

    install -d ${D}${docdir}/libgtest-dev/examples/make
    cp -a ${S}/make/* ${D}${docdir}/libgtest-dev/examples/make
    cp -a ${S}/README ${D}${docdir}/libgtest-dev
    cp -a ${S}/CHANGES ${D}${docdir}/libgtest-dev
    cp -a ${S}/COPYING ${D}${docdir}/libgtest-dev

    install -d ${D}${prefix}/src/gtest
    cp -a ${S}/CMakeLists.txt ${D}${prefix}/src/gtest
    cp -a ${S}/cmake ${D}${prefix}/src/gtest
    cp -a ${S}/src ${D}${prefix}/src/gtest

    install -d ${D}${bindir}
    cp -a ${S}/scripts/*.py ${D}${bindir}
}

FILES_${PN}-dev = "\
${includedir}/gtest \
${docdir} \
${prefix}/src"
