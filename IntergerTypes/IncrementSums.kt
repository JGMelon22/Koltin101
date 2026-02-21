import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter first integer:")
    val num1 = scanner.nextInt()

    println("Enter second integer:")
    val num2 = scanner.nextInt()

    var sum = num1 + num2
    sum++

    println("The incremented sum of two integers is $sum")
}
