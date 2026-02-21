// Importing required library
import kotlin.math.sqrt

fun main(args: Array<String>) {
    // Reading the integer from user
    val input = readLine()!!.toInt()

    // Perform the arithmetic operations on 'input' here
    val square: Int = input * input;

    // Prepare the output in required format and print it
    val result: Double = sqrt(input.toDouble())
    println("Square: $square, Square root: $result")
}