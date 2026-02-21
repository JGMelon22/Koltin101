fun main() {
    val input = readln().toDouble()

    println(calculation(input))
}

fun calculation(x: Double): Double {
    return ((x * x * x) + (x * x) + x + 1)
}
