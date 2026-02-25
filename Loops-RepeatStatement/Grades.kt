fun main() {
    val input: Int = readln().toInt()

    findQuantityPerGrade(input)
}

fun findQuantityPerGrade(amountOfGrades: Int): Unit {

    var aGrade = 0
    var bGrade = 0
    var cGrade = 0
    var dGrade = 0

    repeat(amountOfGrades) {
        val grade: Int = readln().toInt()
        when (grade) {
            2 -> dGrade++
            3 -> cGrade++
            4 -> bGrade++
            5 -> aGrade++
            else -> null
        }
    }

    println("$dGrade $cGrade $bGrade $aGrade")
}

// Using List<T> instead
// fun main() {
//     val input: Int = readln().toInt()
//     findQuantityPerGrade(input)
// }

// fun findQuantityPerGrade(amountOfGrades: Int): Unit {
//     val grades = mutableListOf<Int>()
//     repeat(amountOfGrades) {
//         grades.add(readln().toInt())
//     }

//     var aGrade = 0
//     var bGrade = 0
//     var cGrade = 0
//     var dGrade = 0

//     grades.forEach { grade ->
//         when (grade) {
//             2 -> dGrade++
//             3 -> cGrade++
//             4 -> bGrade++
//             5 -> aGrade++
//             else -> // handle invalid grade
//         }
//     }

//     println("$dGrade $cGrade $bGrade $aGrade")
// }
