DESCRIPTION = "A basic ROS Communication."

require recipes-core/images/beaglebone-base-image.bb

BASE_INSTALL = " \
    python-catkin-pkg \
    python-empy \
    python-nose \
    python-modules \
    python-misc \
    python-empy \
    python-setuptools \
    python-dev \
    libtinyxml \
    libtinyxml-dev \
    log4cxx \
    log4cxx-dev \
    libbz2-dev \
    python-argparse \
    python-rosdep \
    python-wstool \
"

IMAGE_INSTALL += " \
    ${BASE_INSTALL} \
"
