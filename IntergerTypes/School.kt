fun main() {
    val firstGroup: Short = readln().toShort()
    val secondGroup: Short = readln().toShort()
    val thirdGroup: Short = readln().toShort()
    
    val resultFirstGroup: Short = (firstGroup / 2 + firstGroup % 2).toShort()
    val resultSecondGroup: Short = (secondGroup / 2 + secondGroup % 2).toShort()
    val resultThirdGroup: Short = (thirdGroup / 2 + thirdGroup % 2).toShort()

    val result: Short = (resultFirstGroup + resultSecondGroup + resultThirdGroup).toShort()

    println(result)
}
