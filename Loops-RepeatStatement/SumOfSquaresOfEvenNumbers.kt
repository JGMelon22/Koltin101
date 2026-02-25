import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Read an integer input
    val limit = reader.nextInt()

    reader.close()

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {
        println(checkForEvenValuesAndSum(limit))
    }

}

fun checkForEvenValuesAndSum(limit: Int): Int {
    var sum = 0
    for (number in 1..limit) {
        if (number % 2 == 0) {
            sum += (number.toDouble().pow(2.0)).toInt()
        }
    }

    return sum;
}
