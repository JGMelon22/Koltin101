import kotlin.math.ceil
import kotlin.math.floor

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val n: Int = readln().toInt()

    println(countNumbersDivisibleByN(a, b, n))
    // (println(countNumbersDivisibleByNWithoutnLoop(a, b, n)))
}

fun countNumbersDivisibleByN(a: Int, b: Int, n: Int): Int {
    var count = 0

    for (index in a..b) {
        if (index % n == 0)
            count++
    }

    return count
}

// fun countNumbersDivisibleByNWithoutnLoop(a: Int, b: Int, n: Int): Int {

//     return (
//             floor(b.toDouble() / n).toInt() -
//                     ceil((a - 1).toDouble() / n).toInt() + 1
//             )
// }
