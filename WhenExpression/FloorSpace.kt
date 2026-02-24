import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    when (val geometricForm: String = readln()) {
        "triangle" -> {
            val sizeA: Double = readln().toDouble()
            val sizeB: Double = readln().toDouble()
            val sizeC: Double = readln().toDouble()
            totalArea(geometricForm, sizeA, sizeB, sizeC)
        }

        "rectangle" -> {
            val sizeA: Double = readln().toDouble()
            val sizeB: Double = readln().toDouble()
            totalArea(geometricForm, sizeA, sizeB)
        }

        "circle" -> {
            val sizeA: Double = readln().toDouble()
            totalArea(geometricForm, sizeA)
        }
    }

}

fun totalArea(geometricForm: String, sizeA: Double, sizeB: Double = 0.0, sizeC: Double = 0.0): Unit {
    when (geometricForm) {
        "triangle" -> {
            val semiPerimeter = (sizeA + sizeB + sizeC) / 2.0
            val areaFormula =
                sqrt(semiPerimeter * (semiPerimeter - sizeA) * (semiPerimeter - sizeB) * (semiPerimeter - sizeC))
            println(areaFormula)
        }

        "rectangle" -> println(sizeA * sizeB)
        "circle" -> println(3.14 * sizeA.pow(2.0))
    }
}
