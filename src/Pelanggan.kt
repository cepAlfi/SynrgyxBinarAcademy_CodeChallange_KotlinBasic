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
        } else {
            inputMemberData(1)
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

    fun inputMemberData(nonMember: Int){
        var namaMemberInput = ""
        TransaksiMember(namaMemberInput).showTransaksi()
    }


}
