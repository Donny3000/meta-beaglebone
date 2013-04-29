DESCRIPTION = "The PIN-Entry package contains a collection of simple PIN or "\
"pass-phrase entry dialogs which utilize the Assuan protocol as described by "\
"the Agypten project. PIN-Entry programs are usually invoked by the gpg-agent "\
"daemon, but can be run from the command line as well. There are programs for "\
"various text-based and GUI environments, including interfaces designed for "\
"Ncurses (text-based), Gtk+, Gtk+-2, Qt-3, and Qt-4."
SECTION = "applications"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libx11"
RDEPENDS = "ncurses rng-tools glib-2.0"

SRC_URI = "ftp://ftp.gnupg.org/gcrypt/pinentry/pinentry-${PV}.tar.bz2"

inherit autotools

EXTRA_OECONF = "--enable-pinentry-curses --disable-glibtest --disable-gtktest"

SRC_URI[md5sum] = "82e6114e5e27a8ab36f314b332a6e024"
SRC_URI[sha256sum] = "5084b7b6aac5725303f3b0185f126daa8b33ee78ade538edf1e20034594a39b1"
