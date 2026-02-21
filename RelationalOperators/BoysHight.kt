fun main() {
    val firstBoy: Short = readln().toShort()
    val secondBoy: Short = readln().toShort()
    val thirdBoy: Short = readln().toShort()

    val result: Boolean =
        (secondBoy in firstBoy..thirdBoy) || (secondBoy in thirdBoy..firstBoy)

    println(result)
}
