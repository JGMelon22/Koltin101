fun main() {
    val input: Int = readln().toInt()
    areNumbersSorted(input)
}

fun areNumbersSorted(number: Int): Unit {
    var previousNumber: Int? = null

    for (index in 1..number) {
        val number: Int = readln().toInt()

        if (previousNumber == null) {
            previousNumber = number
        } else if ((number < previousNumber)) {
            println("NO")
            return
        }

        previousNumber = number
    }

    println("YES")
}
