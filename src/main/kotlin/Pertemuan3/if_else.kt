package Pertemuan3

fun main() {

    //if_else
    val nilai = 70

    if (nilai > 50){
        println("Lulus")
    }else{
        println("Tidak lulus")
    }

    println()

    //if bersarang
    if (nilai > 70){
        println("A")
    }else if (nilai > 60){
        println("B")
    }else{
        println("C")
    }

    println()

    //when
    val number = 3
    val hasil = when(number){
        1 -> "satu"
        2 -> "dua"
        3 -> "tiga"
        else -> "nomor tidak valid"
    }
    println(hasil)


}