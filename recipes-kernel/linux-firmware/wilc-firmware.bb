SECTION = "kernel"
LICENSE = "CLOSED"

SRCREV = "f808199da32931e6b78d8445547d977839c91caf"
SRC_URI = "git://github.com/atwilc3000/firmware.git"

PACKAGES =+ "linux-firmware-atmel-wilc3000"

S = "${WORKDIR}/git"

do_install() {
  install -d ${D}/lib/firmware/
  install -m 0755 *.bin ${D}/lib/firmware/
}

FILES_linux-firmware-atmel-wilc3000 += " \
  /lib/firmware/wifi_firmware_ap.bin \
  /lib/firmware/wifi_firmware.bin \
  /lib/firmware/wifi_firmware_p2p_concurrency.bin\
  /lib/firmware/bt_firmware.bin "