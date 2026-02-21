fun main() {

    val celcius = readln().toDouble()
    println(converter(celcius))
}

fun converter(celcius: Double): Double {
    return celcius * 1.8 + 32
}
