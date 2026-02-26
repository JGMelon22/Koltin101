fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    var result: Long = 1

    for (index in a until b) {
        result *= index.toLong()
    }

    println(result)
}
