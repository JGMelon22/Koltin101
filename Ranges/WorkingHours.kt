fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14

    println(isInWorkingHours(time, workTime, lunchTime))
}

fun isInWorkingHours(reservationTime: Int, workTime: IntRange, lunchTime: IntRange): Boolean {
    return ((reservationTime in workTime) && reservationTime !in lunchTime)
}
