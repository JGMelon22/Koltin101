fun main() {
    val number = readln().toInt()

    val message: String = when {
        number < 0 -> "negative"
        number > 0 -> "positive"
        else -> "zero"
    }

    println(message)
}
