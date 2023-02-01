require recipes-kernel/linux/linux-mainline.inc

DESCRIPTION = "Mainline Longterm Linux kernel"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v6.x/linux-${PV}.tar.xz \
    file://defconfig \
    "

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[sha256sum] = "d60cf185693c386e7acd9f3eb3a94ae30ffbfee0a9447a20e83711e0bdf5922b"

