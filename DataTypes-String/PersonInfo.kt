fun main() {
    val personInformation: String = readln()
    val parts: List<String> = personInformation.split(" ")
    val personSecondName: String = parts[1]
    val personAge: String = (personInformation[personInformation.length - 2] + personInformation.last().toString())

    println("${personInformation.first()}. $personSecondName, $personAge years old")
}
