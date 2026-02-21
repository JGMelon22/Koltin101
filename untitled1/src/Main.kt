import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // Read a line of input from the user.
    val firstNumber: Int = scanner.nextInt();
    val secondNumber: Int = scanner.nextInt();

    scanner.close()

    // Print the reversed string.
    println("$firstNumber + $secondNumber equals ${firstNumber + secondNumber}")
}