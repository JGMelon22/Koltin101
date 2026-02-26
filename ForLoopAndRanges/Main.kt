fun main() {
    val amountOfNumbers: Int = readln().toInt()

    sumNumbers(amountOfNumbers)
}

fun sumNumbers(numbers: Int): Unit {
    var sum = 0

    for (index in 1..numbers) {
        val input: Int = readln().toInt()

        sum += input
    }

    println(sum)
}
