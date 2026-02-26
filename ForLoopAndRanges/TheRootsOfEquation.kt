fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()

    for (index in 0..1000) {
        val root = a * index * index * index +
                b * index * index +
                c * index + d

        if (root == 0)
            println(index)
    }
}
