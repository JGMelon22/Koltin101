import java.util.*

fun main(args: Array<String>) {
    // Scanner object for reading inputs.
    val reader = Scanner(System.`in`)

    // TODO: Read two integers from the user.
    val firstNumber = reader.nextInt()
    val secondNumber = reader.nextInt()

    var result = ""

    reader.close()
    // TODO: Compare the two integers using Kotlin's relational operators.
    if (firstNumber == secondNumber) {
        result = "equal"
    } else if (firstNumber > secondNumber) {
        result = "greater"
    } else {
        result = "less"
    }
    // TODO: Print out the outcome of the comparison ("equal", "greater", or "less").
    println(result)
}
