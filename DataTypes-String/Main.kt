fun main() {
    val firstItem: String = readln()
    val secondItem: String = readln()
    val thirdItem: String = readln()

    println(firstConcactWithSecondIsEqualToThird(firstItem, secondItem, thirdItem))
}

fun firstConcactWithSecondIsEqualToThird(firstItem: String, secondItem: String, thirdItem: String): Boolean {
    return firstItem + secondItem == thirdItem
}
