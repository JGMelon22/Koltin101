fun main() {
    val input: Int = readln().toInt()

    var number = 1
    var totalCount = 0

    // Outer loop: increment number until we've printed input numbers
    while (totalCount < input) {
        // Print number a certain number of times (equal to number itself)
        var repetitions = 0
        while (repetitions < number && totalCount < input) {
            // Print number and increment totalCount
            print("$number ")
            totalCount++
            repetitions++
        }
        // Increment number for the next iteration
        number++
    }
}
