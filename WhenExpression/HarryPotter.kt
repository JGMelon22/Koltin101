fun main() {
    val house: String = readln()
    whichTrait(house)
}

fun whichTrait(house: String): Unit {
    when (house) {
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}
