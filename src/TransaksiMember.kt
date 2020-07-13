class TransaksiMember(var namaPelanggan: Any) {
    companion object {
        var dataNamaBarang = ArrayList<Any>()
        var dataJumlahBarang = ArrayList<Any>()
        var dataHargaBarang = ArrayList<Any>()
    }

    fun Any.addRp(): Unit = print("Rp. $this")

    fun showTotalHarga(harga: Int, jumlah: Int): Int {
        return harga * jumlah
    }

    fun showTransaksi() {
        if (namaPelanggan !== "") {
            println("""
            -----------------------------
            Checkout Pelanggan Member $namaPelanggan
            -----------------------------
            """.trimIndent())
        } else {
            println("""
            -----------------------------
            Checkout Pelanggan Non Member
            -----------------------------
            """.trimIndent())
        }

        do {
            print("Input nama barang: ")
            val namaBarangInput = readLine()!!
            print("Input harga barang: ")
            val hargaBarangInput = readLine()!!.toInt()
            print("Input jumlah barang: ")
            val jumlahBarangInput = readLine()!!.toInt()
            val totalHargaBarang = showTotalHarga(hargaBarangInput, jumlahBarangInput)

            dataNamaBarang.add(namaBarangInput)
            dataHargaBarang.add(totalHargaBarang)
            dataJumlahBarang.add(jumlahBarangInput)

            println("-----------------------------")
            print("Input barang lagi? (Y/N)")
            val inputBarangBaru = readLine()!!
            println("-----------------------------")

        } while (inputBarangBaru != "N" || inputBarangBaru == "y")

        var i = 0

        while (i < dataHargaBarang.size) {
            println("${dataNamaBarang[i]} x ${dataJumlahBarang[i]} = Rp. ${dataHargaBarang[i]}")
            i++
        }

        println("-----------------------------")
        var totalHarga = (dataHargaBarang).sumBy { it as Int }
        print("Total tagihan: ")
        totalHarga.addRp()

    }
}
