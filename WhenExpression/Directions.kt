fun main() {
    val direction: Byte = readln().toByte()
    whichDirection(direction)
}

fun whichDirection(direction: Byte): Unit {
    println(
        when (direction) {
            0.toByte() -> "do not move"
            1.toByte() -> "move up"
            2.toByte() -> "move down"
            3.toByte() -> "move left"
            4.toByte() -> "move right"
            else -> "error!"
        }
    )
}
