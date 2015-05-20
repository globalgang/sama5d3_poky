DESCRIPTION = "Initialize script for wilc1000 demo"
LICENSE = "CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}/script:"

SRC_URI = " \
  file://wilc1000-demo-init \
  file://wilc_hostapd.conf \
  file://wilc_wpa_supplicant.conf \
  file://wilc_udhcpd.conf "

S = "${WORKDIR}"

inherit update-rc.d allarch

INITSCRIPT_NAME = "wilc1000demo"
INITSCRIPT_PARAMS = "start 99 5 . stop 19 0 1 6 ."

do_install() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 wilc1000-demo-init ${D}${sysconfdir}/init.d/wilc1000demo
}

do_install_append() {
  install -d ${D}${sysconfdir}/
  install -m 0755 *.conf ${D}${sysconfdir}
}