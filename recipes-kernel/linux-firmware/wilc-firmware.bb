SECTION = "kernel"
LICENSE = "CLOSED"

SRCREV = "0a07216b455e50c1872aee7d8558c73270fd7bda"
SRC_URI = "git://github.com/atwilc3000/firmware.git"

PACKAGES =+ "linux-firmware-atmel-wilc3000"

S = "${WORKDIR}/git"

do_install() {
  install -d ${D}/lib/firmware/
  install -m 0755 wifi* ${D}/lib/firmware/
  install -m 0755 bt_fw_BR1375000_FC_13_21* ${D}/lib/firmware/
}

FILES_linux-firmware-atmel-wilc3000 += " \
  /lib/firmware/wifi_firmware_ap.bin \
  /lib/firmware/wifi_firmware.bin \
  /lib/firmware/wifi_firmware_p2p_concurrency.bin\
  /lib/firmware/bt_fw_BR1375000_FC_13_21.bin "