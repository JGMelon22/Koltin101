import java.util.Scanner

fun main() {
   val scanner = Scanner(System.`in`)

    var N = scanner.nextInt();

    ++N
    N -= 2

    println(N)

    scanner.close()
}