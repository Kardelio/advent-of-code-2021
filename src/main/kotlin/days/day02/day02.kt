package days.day02

import java.io.File

fun main() {
    val fileoutput = File("src/main/kotlin/days/day02/data.txt").readLines()
    partOne(fileoutput)
    partTwo(fileoutput)
}

fun partOne(data: List<String>) {
    var horizontalPos = 0
    var verticalPos = 0

    data.forEach {
        val splitted = it.split(" ")
        val instruction = splitted[0]
        val amount = splitted[1]
        when (instruction) {
            "up" -> {
                verticalPos -= amount.toInt()
            }
            "down" -> {
                verticalPos += amount.toInt()
            }
            "forward" -> {
                horizontalPos += amount.toInt()
            }
        }
    }
    println("Hor: ${horizontalPos}, Ver: ${verticalPos}, Times: ${horizontalPos * verticalPos}")
    // Hor: 1868, Ver: 1090, Times: 2036120
}

fun partTwo(data: List<String>){
    var horizontalPos = 0
    var verticalPos = 0
    var aim = 0

    data.forEach {
        val splitted = it.split(" ")
        val instruction = splitted[0]
        val amount = splitted[1]
        when (instruction) {
            "up" -> {
                aim -= amount.toInt()
            }
            "down" -> {
                aim += amount.toInt()
            }
            "forward" -> {
                horizontalPos += amount.toInt()
                verticalPos += (amount.toInt() * aim)
            }
        }
    }
    println("Hor: ${horizontalPos}, Ver: ${verticalPos}, Times: ${horizontalPos * verticalPos}")
    // Hor: 1868, Ver: 1078987, Times: 2015547716
}