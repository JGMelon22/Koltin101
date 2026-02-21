fun main() {
    val firstChar: Char = readln().first()
    val secondChar: Char = readln().first()
    val thirdChar: Char = readln().first()
    val fourthChar: Char = readln().first()

    returnPreviousChar(firstChar, secondChar, thirdChar, fourthChar)
}


fun returnPreviousChar(firstChar: Char, secondChar: Char, thirdChar: Char, fourthChar: Char) {
    println("${firstChar - 1}\n${secondChar - 1}\n${thirdChar - 1}\n${fourthChar - 1}\n")
}
