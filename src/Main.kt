class Main {
    fun showMainMenu() {
        println("""
        -----------------------------
        Selamat Datang di Synrgy Mart
        -----------------------------
        1. Login Kasir
        0. Keluar
    """.trimIndent())
        print("Masukkan pilihan menu: ")
        val menuInput = readLine()?.toInt()

        if (menuInput == 1) {
            Login().showLoginMenu()
        } else {
            return
        }
    }
}

fun main() {
    Main().showMainMenu()
}