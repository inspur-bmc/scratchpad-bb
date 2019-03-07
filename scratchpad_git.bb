# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "git://github.com/inspur-bmc/scratchpad.git"

# Modify these as desired
PV = "0.1+git${SRCPV}"
SRCREV = "0e0d3809f046fd0988b60e96e989b7e5a2e92aef"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
inherit systemd

DEPENDS += "autoconf-archive-native"
DEPENDS += "systemd"

SYSTEMD_SERVICE_${PN} += "xyz.openbmc_project.scratchpad.service"
# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

