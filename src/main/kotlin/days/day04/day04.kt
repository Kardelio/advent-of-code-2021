package days.day04

import java.io.File

fun main() {
    val fileoutput = File("src/main/kotlin/days/day04/data.txt").readLines()
    val bingoNumbers = fileoutput[0].split(",").map { it.toInt() }
    val justBoards = fileoutput.drop(1)
//    println(bingoNumbers)
    partOne(bingoNumbers, justBoards)
//    partTwo(fileoutput)
}

fun partOne(bingoNumbers: List<Int>, data: List<String>) {
    println(bingoNumbers)
    convertLinesToBlocks(data)

}

class BingoBlock(val id: Int) {
    var m = Array(6) { Array(5) { 0 } }
    fun pr() {
        println(m)
    }
}


fun convertLinesToBlocks(data: List<String>) {
    println(data)
    var holdingBlocks = mutableListOf<BingoBlock>()
    var currentblock = 0
    var aa = Array(5){ Array(5){ 0 }}
    aa[0][0] = 0
    data.forEach {
        if (it.isBlank()) {
            currentblock++
            holdingBlocks.add(BingoBlock(currentblock))
            println("--------")
        } else {
            val a = holdingBlocks.find { it.id == currentblock }
            a!!.m[0][0] = 1

            println("BLOCK LINE")
        }
    }
    println(holdingBlocks)
}


fun partTwo(data: List<String>) {
}
