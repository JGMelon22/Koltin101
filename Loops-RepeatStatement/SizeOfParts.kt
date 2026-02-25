fun main() {
    val input: Int = readln().toInt()
    quantityPerComponent(input)
}

fun quantityPerComponent(totalParts: Int): Unit {
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(totalParts) {
        val part: Int = readln().toInt()
        when (part) {
            -1 -> smaller++
            0 -> perfect++
            1 -> larger++
            else -> null
        }
    }

    println(" $perfect $larger $smaller")
}
