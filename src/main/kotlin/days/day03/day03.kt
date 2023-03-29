package days.day03

import java.io.File

fun main() {
    val fileoutput = File("src/main/kotlin/days/day03/data.txt").readLines()
//    partOne(fileoutput)
    partTwo(fileoutput)
}

fun partOne(data: List<String>) {
    var a = ""
    var length = data[0].length
    for (i in 0..(length - 1)) {
        a += loopCheck(data, i)
    }
    println("==${a}==")
    println("==${a.toInt(2)}==")
    println("==${a.binFlipper()}==")
    println("==${a.binFlipper().toInt(2)}==")
    val output = a.toInt(2) * a.binFlipper().toInt(2)
    println("Output: ${output}")
    //34830 TOO LOW
    //2250414
}

fun String.binFlipper(): String {
    var out = ""
    this.forEach {
        out += if (it.toInt() == 48) {
            '1'
        } else {
            '0'
        }
    }
    return out
}

fun loopCheck(data: List<String>, counter: Int): Int {
    var numOf0 = 0
    var numOf1 = 0

    data.forEach {
        //48 == 0
        //49 == 1
        println("${it[counter]}--${counter}")
        if (it[counter].toInt() == 48) {
            numOf0++
        } else {
            numOf1++
        }
    }
    return if (numOf1 > numOf0) 1 else 0
}


fun partTwo(data: List<String>) {

    var a = ""
    val length = data[0].length
    for (i in 0..(length - 1)) {
//        val most = loopCheck(data, i)


    }
    val v = recursiveGrab(data, 0)
    println(v)
    /**
     * DID NOT COMPLETE!
     * Damn! What a let down I am! :(
     */
}

fun recursiveGrab(data: List<String>, layer: Int): List<String>{
    val most = loopCheck(data, layer)
    return data.filter {
        val a = it[0]
        val b =most.toString()
        val c = a == b[0]
       c
    }
}