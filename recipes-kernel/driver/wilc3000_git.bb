LICENSE = "CLOSED"

inherit module

SRCREV = "6b689e5a4f84caf9bd4f82060a15489ed7b89a81"
SRC_URI = "git://github.com/atwilc3000/driver.git \
		file://0001-patch_for_kernel_v3.18.patch \
		"

S = "${WORKDIR}/git/"

EXTRA_OEMAKE = '-C ${STAGING_KERNEL_DIR} M=${S} \
  CONFIG_ATMEL_SMARTCONNECT=y \
  CONFIG_WILC3000=m \
  CONFIG_WILC3000_SDIO=y \
  CONFIG_WILC3000_DYNAMICALLY_ALLOCATE_MEMROY=y \
  '

do_install() {
  install -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/atmel/wilc3000
  install -m 0644 ${S}/wilc3000/*${KERNEL_OBJECT_SUFFIX} ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless/atmel/wilc3000
}

#Load Driver Module at Boot
KERNEL_MODULE_AUTOLOAD += "at_pwr_dev"