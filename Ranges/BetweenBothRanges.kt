fun main() {
    val firstValue: Int = readln().toInt()
    val secondValue: Int = readln().toInt()
    val thirdValue: Int = readln().toInt()
    val fourthValue: Int = readln().toInt()
    val fifthValue: Int = readln().toInt()

    println(isBetweenBothRanges(firstValue, secondValue, thirdValue, fourthValue, fifthValue))
}

fun isBetweenBothRanges(
    firstValue: Int,
    secondValue: Int,
    thirdValue: Int,
    fourthValue: Int,
    fifthValue: Int
): Boolean {
    return ((fifthValue in firstValue..secondValue) && fifthValue in thirdValue..fourthValue)
}
