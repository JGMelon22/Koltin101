import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    scanner.close()

    val result = if (num1 > num2) ">" else if (num1 == num2) "=" else "<"
    println(result)
}
