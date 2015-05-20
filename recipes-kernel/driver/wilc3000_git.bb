LICENSE = "CLOSED"

inherit module

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/globalgang/driver-1.git"

S = "${WORKDIR}/git/wilc3000/"

EXTRA_OEMAKE = '-C ${STAGING_KERNEL_DIR} M=${S} \
  CONFIG_WILC3000=m \
  CONFIG_WILC3000_SDIO=y \
  CONFIG_WILC3000_DYNAMICALLY_ALLOCATE_MEMROY=y \
  '

do_install() {
  install -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/atmel/wilc3000
  install -m 0644 wilc3000${KERNEL_OBJECT_SUFFIX} ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/atmel/wilc3000
}

#Load Driver Module at Boot
KERNEL_MODULE_AUTOLOAD += "wilc3000"