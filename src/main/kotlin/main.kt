fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix="Greeting: ")

    fun log(vararg entries: String) {
        printAll(*entries)
    }
}
