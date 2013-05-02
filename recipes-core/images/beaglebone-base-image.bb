DESCRIPTION = "Basic console image"

require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "package-management ssh-server-openssh"

BASE_INSTALL = " \
  ${MACHINE_EXTRA_RRECOMMENDS} \
  ${@base_contains("DISTRO_FEATURES", "bluetooth", "bluez4", "", d)} \
  avahi avahi-utils \
  base-files \
  base-passwd \
  bash \
  coreutils \
  dbus \
  devmem2 \
  netbase \
  ntp \
  net-tools \
  pinentry \
  python \
  polkit \
  rsyslog \
  shadow tinylogin \
  udisks \
  upower \
  util-linux \
  which \
  zypper \
 "

KERNEL_EXTRA_INSTALL = " \
    kernel-modules \
"

NETWORK_INSTALL = " \
  networkmanager \
  networkmanager-tests \
  rfkill \
  wireless-tools \
  ${@base_contains("DISTRO_FEATURES", "wifi", "iw wpa-supplicant", "", d)} \
 "

TOOLS_INSTALL = " \
  bzip2 \
  cmake \
  cpufrequtils \
  dosfstools \
  e2fsprogs \
  evtest \
  findutils \
  htop \
  iputils \
  git \
  gawk \
  grep \
  libgtest \
  gzip \
  less \
  packagegroup-core-ssh-openssh \
  procps \
  python-setuptools \
  sed \
  sudo \
  tar \
  vim \
  vsftpd \
  wget \
  zip \
 "

IMAGE_INSTALL += " \
  ${BASE_INSTALL} \
  ${KERNEL_EXTRA_INSTALL} \
  ${NETWORK_INSTALL} \
  ${ROOTFS_PKGMANAGE} \
  ${TOOLS_INSTALL} \
 "
