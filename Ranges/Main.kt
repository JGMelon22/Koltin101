fun main() {
    val value: Int = readln().toInt()
    println(isBetween(value))
}

fun isBetween(value: Int): Boolean {
    return value !in 1..10
}
