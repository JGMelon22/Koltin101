fun main() {
    val firstNumber: Int = readln().toInt()
    val secondNumber: Int = readln().toInt()
    val thirdNumber: Int = readln().toInt()

    println(isBetweenTwoNumbers(firstNumber, secondNumber, thirdNumber))
}

fun isBetweenTwoNumbers(firstNumber: Int, secondNumber: Int, thirdNumber: Int): Boolean {
    return (firstNumber in secondNumber..thirdNumber)
}
