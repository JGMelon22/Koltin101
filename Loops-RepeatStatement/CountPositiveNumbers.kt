fun main() {
    val input: Int = readln().toInt()
    println(countPositiveNumbers(input))
}

fun countPositiveNumbers(numbers: Int): Int {
    var positiveNumbers = 0

    repeat(numbers) {
        val inputNumber = readln().toInt()
        if (inputNumber > 0) {
            positiveNumbers++
        }
    }

    return positiveNumbers
}
