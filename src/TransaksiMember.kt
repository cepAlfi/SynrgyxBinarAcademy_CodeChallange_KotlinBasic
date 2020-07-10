class TransaksiMember{
    var namaPelanggan = Pelanggan.namaPelanggan

    companion object {
        var dataBarang: MutableMap<Pair<Any, Any>, Any> = mutableMapOf()
    }

    fun inputTest() {
        dataBarang.put(key = Pair("a", "a"), value = "c")
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
            dataBarang.put(key = Pair("$namaBarangInput", hargaBarangInput ), value = jumlahBarangInput)
            println("-----------------------------")
            print("Input barang lagi? (Y/N)")
            val inputBarangBaru = readLine()!!
        } while (inputBarangBaru != "N")

        for (item in dataBarang) {
            print(item.key)
        }
    }
}
