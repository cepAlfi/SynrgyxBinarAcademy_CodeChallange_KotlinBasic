class Login{
    val dataUsers = mapOf("Ucup" to "Ucup123456")

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

        dataUsers.forEach { uname, password -> if (usernameInput == uname && passwordInput == password) {
            println("""
                -----------------------------
                Selamat Datang $uname
                -----------------------------
            """.trimIndent())
            MenuDua().showMenuDua()
        }
        }
    }
}