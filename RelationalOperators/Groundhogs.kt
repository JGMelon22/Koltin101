fun main() {
    val peanutButter: Short = readln().toShort()
    val isWeekend: Boolean = readln().toBoolean()

    var result: Boolean

    if (isWeekend == true) {
        result = peanutButter >= 15 && peanutButter <= 25
    } else {
        result = peanutButter >= 10 && peanutButter <= 20
    }
    println(result);
}
