fun main() {
    var firstChar: Char = readln().first()
    var secondChar: Char = readln().first()
    var thirdChar: Char = readln().first()

    println(firstChar == secondChar.dec() && secondChar == thirdChar.dec())
}
