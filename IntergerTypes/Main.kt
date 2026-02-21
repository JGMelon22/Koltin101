fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000
    val timeSecondsToday = totalSeconds % (24 * 60 * 60)
    val seconds = timeSecondsToday % 60
    val hours = timeSecondsToday / 3600
    val minutes = (timeSecondsToday - (hours * 3600) - seconds) / 60

    println("$hours:$minutes:$seconds")
}
