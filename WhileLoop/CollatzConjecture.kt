fun main() {
    val input: Int = readln().toInt()
    calculateCollatz(input)
}

fun calculateCollatz(number: Int): Unit {
    var input = number

    print("$input ")

    while (input != 1) {
        if (input % 2 == 0) input /= 2 else input = input * 3 + 1
        print("$input ")
    }
}
