class MenuDua {
    fun showMenuDua() {
        println("""
                1. Checkout Pelanggan
                0. Logout
            """.trimIndent())
        print("Masukkan pilihan menu: ")
        val menuInput = readLine()

        when(menuInput) {
            "1" -> Pelanggan().checkoutPelanggan()
            else -> Main().showMainMenu()
        }
    }
}