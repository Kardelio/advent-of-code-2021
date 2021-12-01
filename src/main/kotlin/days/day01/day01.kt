package days.day01

import java.io.File

fun main() {
    val fileoutput = File("src/main/kotlin/days/day01/data.txt").readLines()
    partOne(fileoutput)
    partTwo(fileoutput)
}

fun partOne(contentsOfFile: List<String>) {
    var count = 0

    val contentsAsInts = contentsOfFile.map {
        it.toInt()
    }
    contentsAsInts.forEachIndexed { index, s ->
        val previousIndex = index - 1
        if (previousIndex >= 0) {
            if (contentsAsInts[previousIndex] < s) {
                count++
            }
        }
    }
    println("Day 1: Part 1 -> Count: ${count}")
    //1167
}


fun partTwo(contentsOfFile: List<String>) {
    var count = 0

    val contentsAsInts = contentsOfFile.map {
        it.toInt()
    }

    contentsAsInts.forEachIndexed { index, i ->
        val previousIndex = index - 1
        if (previousIndex >= 0) {
            val nextIndex = index + 1
            val futureIndex = index + 2
            if (nextIndex < contentsAsInts.lastIndex && futureIndex <= contentsAsInts.lastIndex) {
                val sumCurrent = i + contentsAsInts[nextIndex] + contentsAsInts[futureIndex]
                val nextIndexPrev = previousIndex + 1
                val futureIndexPrev = previousIndex + 2
                if (nextIndexPrev < contentsAsInts.lastIndex && futureIndexPrev <= contentsAsInts.lastIndex) {
                    val sumPrevious =
                        contentsAsInts[previousIndex] + contentsAsInts[nextIndexPrev] + contentsAsInts[futureIndexPrev]
                    if (sumPrevious < sumCurrent) {
                        count++
                    }
                }
            }
        }
    }
    println("Day 1: Part 2 -> Count: ${count}")
    //1130
}