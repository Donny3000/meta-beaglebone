DESCRIPTION = "A basic ROS Communication."

require recipes-core/images/beaglebone-base-image.bb

BASE_INSTALL = " \
    packagegroup-ros-comm \
"

IMAGE_INSTALL += " \
    ${BASE_INSTALL} \
"
