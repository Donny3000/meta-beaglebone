DESCRIPTION = "A basic ROS Communication."

require recipes-core/images/beaglebone-base-image.bb

BASE_INSTALL = " \
    coreutils \
    task-core-ssh-openssh \
    htop \
    vsftpd \
    python \
    packagegroup-ros-comm \
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
