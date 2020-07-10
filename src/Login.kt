open class Login{
    companion object {
        private const val USERNAME = "MasAgus"
        private const val PASSWORD = "apajaboleh"
    }

    fun showLoginMenu() {
        println("""
            -----------------------------
            Selamat Datang di Synrgy Mart
            -----------------------------
            +Login Kasir+
        """.trimIndent())
        print("Username: ")
        var usernameInput = readLine()
        print("Password: ")
        var passwordInput = readLine()

        if (usernameInput == USERNAME && passwordInput == PASSWORD) {
            println("""
                -----------------------------
                Selamat Datang $USERNAME
                -----------------------------
            """.trimIndent())
            MenuDua().showMenuDua()
        }
    }
}