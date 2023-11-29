package Pertemuan3

fun main() {

    //for range
    for (i in 1..25){
        println("Nilai = $i")
    }

    println()

    //for down
    for (a in 25 downTo 1){
        println("Nilai = $a")
    }

    println()

    //for array
    val cars = arrayOf("volvo", "BMW", "ford", "Mazda")
    for (x in cars){
        println(x)
    }

    println()

    //while
    var i = 1
    while (i <= 5){
        println("Nilai $i")
        i++
    }

    println()

    //do-while
    var nilai = 1
    do {
        println("buka pintu - percobaan ke $nilai")
        nilai++
    }while (nilai <= 5)
}