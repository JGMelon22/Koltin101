fun main() {
    val input: String = readln()
    val firstPart: Char = input[0]
    val lastPart: Char = input[input.length - 1]

    println("$lastPart${input.substring(1, input.length - 1)}$firstPart")
}
