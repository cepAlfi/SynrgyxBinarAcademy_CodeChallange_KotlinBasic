class TransaksiMember{
    var namaPelanggan = Pelanggan.namaPelanggan

    companion object {
        var dataJumlahBarang = mutableMapOf<Any, Any>()
        var dataHargaBarang = mutableMapOf<Any, Any>()
    }

    fun showTransaksi() {
        println("""
        -----------------------------
        Checkout Pelanggan Member $namaPelanggan
        -----------------------------
    """.trimIndent())
        do {
            print("Input nama barang: ")
            val namaBarangInput = readLine()!!
            print("Input harga barang: ")
            val hargaBarangInput = readLine()!!.toInt()
            print("Input jumlah barang: ")
            val jumlahBarangInput = readLine()!!.toInt()
            val totalHargaBarang = hargaBarangInput * jumlahBarangInput

            dataHargaBarang.set(namaBarangInput, totalHargaBarang)
            dataJumlahBarang.set(namaBarangInput, jumlahBarangInput)

            println("-----------------------------")
            print("Input barang lagi? (Y/N)")
            val inputBarangBaru = readLine()!!

        } while (inputBarangBaru != "N" || inputBarangBaru == "y")

        for (jumlah in dataJumlahBarang) {
            for (harga in dataHargaBarang) {
                print("${jumlah.key} ")
                print("${jumlah.value} ")
                println(harga.value)
            }
        }
    }
}
