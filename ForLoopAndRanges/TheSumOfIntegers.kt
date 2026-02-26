fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()

    var sum = 0

    for (index in a..b) {
        sum += index
    }

    println(sum)
}
