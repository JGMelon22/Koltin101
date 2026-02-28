fun main() {
    val input: Int = readln().toInt()
    var squareNumber = 1

    while (squareNumber * squareNumber <= input) {
        println(squareNumber * squareNumber)
        squareNumber++
    }
}
