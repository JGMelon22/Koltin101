import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var total = 0
    var next: Int

    while (scanner.hasNextInt()) {
        next = scanner.nextInt()

        if (next == 0)
            break

        total++
    }

    println(total)
}
