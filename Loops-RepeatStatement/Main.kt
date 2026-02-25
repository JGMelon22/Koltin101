fun main() {
    val n = readln().toInt()
    var sum = 0

    repeat(n) {
        val next = readln().toInt()
        sum += next
    }

    println(sum)
}
