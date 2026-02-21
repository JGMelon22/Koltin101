fun main() {
    val firstPoint: Short = readln().toShort()
    val secondPoint: Short = readln().toShort()
    val thirdPoint: Short = readln().toShort()

    println(isValidTriangle(firstPoint, secondPoint, thirdPoint))
}

fun isValidTriangle(firstPoint: Short, secondPoint: Short, thirdPoint: Short): String {
    if (firstPoint + secondPoint <= thirdPoint || firstPoint + thirdPoint <= secondPoint || secondPoint + thirdPoint <= firstPoint)
        return "NO"
    return "YES"
}
