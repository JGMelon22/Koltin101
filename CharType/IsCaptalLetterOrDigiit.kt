fun main() {
    val item: Char = readln().first()

    println((item.isLetter() && item.isUpperCase()) || (item.isDigit() && item.digitToInt() >= 1 && item.digitToInt() <= 9))
}
