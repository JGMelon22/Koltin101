fun main() {
    val value: Int = readln().toInt()
    println(checkInterval(value))
}

fun checkInterval(value: Int): String {
    if ((-15 < value && value <= 12) ||
        (value in 15..<17) ||
        (19 <= value)
    )
        return "True"
    return "False"
}
