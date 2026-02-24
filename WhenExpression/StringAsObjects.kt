fun main() {
    val input: String = readln()
    println(manipulateString(input))
}

fun manipulateString(input: String): String {
    return when {
        input.isEmpty() -> input
        input.first() == 'i' -> (input.drop(1).toInt() + 1).toString()
        input.first() == 's' -> input.drop(1).reversed()
        else -> input
    }
}
