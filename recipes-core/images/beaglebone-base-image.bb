DESCRIPTION = "A base image just capable of booting the beaglebone and providing ssh."

require recipes-core/images/core-image-minimal.bb

BASE_INSTALL = " \
    coreutils \
    task-core-ssh-openssh \
    htop \
    vsftpd \
    python \
"

DEV_TOOLS = "\
    gdb \
"

KERNEL_EXTRA_INSTALL = " \
    kernel-modules \
"

IMAGE_INSTALL += " \
    ${BASE_INSTALL} \
    ${DEV_TOOLS} \
    ${KERNEL_EXTRA_INSTALL} \
"

IMAGE_FEATURES += "ssh-server-openssh openssh-sftp-server"
