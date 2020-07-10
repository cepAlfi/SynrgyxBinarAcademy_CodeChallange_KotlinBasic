open class Pelanggan(): PelangganAbstract() {
    public override fun checkoutPelanggan() {
        println("""
        -----------------------------
        Checkout Pelanggan
        -----------------------------
        1. Pelangggan Member
        2. Pelanngan Non Member
        -----------------------------
    """.trimIndent())
        print("Masukkan jenis pelanggan: ")
        val jenisPelangganInput = readLine()

        if (jenisPelangganInput == "1") {
            inputMemberData()
        }
    }

    fun inputMemberData(){
        println("""
        -----------------------------
        Checkout Pelanggan Member
        -----------------------------
    """.trimIndent())
        print("Input nama member: ")
        var namaMemberInput = readLine()!!
        TransaksiMember(namaMemberInput).showTransaksi()
    }
}
