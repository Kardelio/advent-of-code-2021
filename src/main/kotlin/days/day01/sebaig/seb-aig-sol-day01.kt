package days.day01.sebaig

import java.io.File

fun main() {
    val fileoutput = File("src/main/kotlin/days/day01/data.txt").readLines().map { it.toInt() }
    println(
        fileoutput
            .windowed(2)
            .count { (a, b) -> b > a }
    )
    println(
        fileoutput
            .windowed(3) { it.sum() }
            .windowed(2)
            .count { (a, b) -> b > a }
    )
}