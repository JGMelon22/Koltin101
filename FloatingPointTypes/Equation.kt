fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    println(resolvesEquation(a, b, c))
}

fun resolvesEquation(a: Double, b: Double, c: Double): Double {
    return (c - b) / a
}
