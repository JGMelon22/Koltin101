fun main() {
    val string: String = readln()
    val beforeLastU: String = string.substringBeforeLast("u")
    val afterLastU: String = string.substringAfterLast("u")
    val restOfWord: String = afterLastU.uppercase()

    println(beforeLastU + "u" + restOfWord)

}
