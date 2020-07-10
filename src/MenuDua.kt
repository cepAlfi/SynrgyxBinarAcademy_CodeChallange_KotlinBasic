class MenuDua: Pelanggan() {
    fun showMenuDua() {
        println("""
                1. Checkout Pelanggan
                0. Logout
            """.trimIndent())
        print("Masukkan pilihan menu: ")
        val menuInput = readLine()!!.single()

        when(menuInput) {
            '1' -> Pelanggan().checkoutPelanggan()
            else -> Main().showMainMenu()
        }
    }
}