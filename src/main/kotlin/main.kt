data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))

    val forthUser = user.copy("Lax", 3)
    println(user)
    println(forthUser)

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}
