fun main() {
    val (var1: String, op: String, var2: String) = readln().split(" ")

    val a: Int = var1.toInt()
    val b: Int = var2.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}
