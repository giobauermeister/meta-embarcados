DESCRIPTION = "Embarcados Easy Installer Metadata"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://prepare_emb.sh \
    file://wrapup_emb.sh \
    file://logo_embarcados.png \
    file://marketing_embarcados.tar;unpack=false \
"

inherit deploy nopackages

do_deploy() {
    install -m 644 ${WORKDIR}/prepare_emb.sh ${DEPLOYDIR}
    install -m 644 ${WORKDIR}/wrapup_emb.sh ${DEPLOYDIR}
    install -m 644 ${WORKDIR}/logo_embarcados.png ${DEPLOYDIR}
    install -m 644 ${WORKDIR}/marketing_embarcados.tar ${DEPLOYDIR}
}
addtask deploy before do_build after do_install

PACKAGE_ARCH = "${MACHINE_ARCH}"