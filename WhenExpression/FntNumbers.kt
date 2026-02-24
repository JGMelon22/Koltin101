// fun main() {
//     val number: Int = readln().toInt()
//     println(fntNumberCheck(number))

// }

// fun fntNumberCheck(number: Int): Char {
//     return when (number) {
//         0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> 'F'
//         0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> 'T'
//         1, 10, 100, 1000, 10000, 100000 -> 'P'
//         else -> 'N'
//     }
// }

fun main() {
    val number: Int = readln().toInt()
    println(fntNumberCheck(number))
}

fun fntNumberCheck(number: Int): Char {
    val fibonacciNumbers: List<Int> = listOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val triangleNumbers: List<Int> = listOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val powerOf10: List<Int> = listOf(1, 10, 100, 1000, 10000, 100000)

    return when (number) {
        in fibonacciNumbers -> 'F'
        in triangleNumbers -> 'T'
        in powerOf10 -> 'P'
        else -> 'N'
    }
}
