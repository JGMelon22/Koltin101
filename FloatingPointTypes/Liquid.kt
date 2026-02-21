import kotlin.math.exp
import kotlin.math.pow

fun main() {
    val liquidDensity: Double = readln().toDouble()
    val heightOfColumn: Double = readln().toDouble()

    println(calculatesLiquidPressure(liquidDensity, heightOfColumn))
}

fun calculatesLiquidPressure(liquidDensity: Double, heightOfColumn: Double): Double {
    val gravity = 9.8
    val p: Double = liquidDensity * gravity * heightOfColumn

    return (p)
}
