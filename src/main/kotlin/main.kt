fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrai" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)


    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

    for  (p in sophia.likedPeople) {
        println(p.name)
    }
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}
}