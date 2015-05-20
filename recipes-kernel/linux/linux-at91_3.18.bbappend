COMPATIBLE_MACHINE_sama5d3_xplained = "sama5d3_xplained"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-at91_3.18:"
SRCREV = "f19c245933e85e989ba1bf75965eb3d826bc4eb1"

SRC_URI += "file://0001-patch-atmel_mci-for-wilc3000.patch \
			file://0002-patch-dts-file-for-using-serial3.patch \
			"

EXTRA_OEMAKE = ' \
CONFIG_BT=y \
CONFIG_BT_RFCOMM=y \
CONFIG_BT_RFCOMM_TTY=y \
CONFIG_BT_BNEP=y \
CONFIG_BT_BNEP_MC_FILTER=y \
CONFIG_BT_BNEP_PROTO_FILTER=y \
CONFIG_BT_HIDP=y \
CONFIG_BT_HCIBTUSB=y \
CONFIG_BT_HCIBTSDIO=y \
CONFIG_BT_HCIUART=y \
CONFIG_BT_HCIUART_H4=y \
CONFIG_BT_HCIUART_BCSP=y \
CONFIG_BT_HCIUART_ATH3K=y \
CONFIG_BT_HCIUART_LL=y \
CONFIG_BT_HCIUART_3WIRE=y \
CONFIG_BT_HCIBCM203X=y \
CONFIG_BT_HCIBPA10X=y \
CONFIG_BT_HCIBFUSB=y \
CONFIG_BT_HCIVHCI=y \
CONFIG_BT_MRVL=y \
CONFIG_BT_MRVL_SDIO=y \
CONFIG_BT_ATH3K=y \
'