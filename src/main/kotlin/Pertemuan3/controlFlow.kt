package Pertemuan3

fun main(){

    //Operator aritmatika
    println("OPERATOR ARITMATIKA")
    val plus = 5 + 5
    val minus = 5 - 5
    val kali = 5 * 5
    val bagi = 5 / 5
    val modulus = 5 % 5

    println("5 + 5 = $plus")
    println("5 - 5 = $minus")
    println("5 * 5 = $kali")
    println("5 / 5 = $bagi")
    println("5 % 5 = $modulus")

    println()

    //Operator perbandingan
    val a = 10
    val b = 5

    val lebihDari = a > b
    val kurangDari = a < b
    val lebihDariSamadengan = a >= b
    val kurangDariSamadengan = a <= b
    val samaDengan = a == b
    val tidakSamaDengan = a != b

    println("OPERATOR PERBANDINGAN")
    println(lebihDari)
    println(kurangDari)
    println(lebihDariSamadengan)
    println(kurangDariSamadengan)
    println(samaDengan)
    println(tidakSamaDengan)

    println()

    println("OPERATOR LOGIKA")
    //Operator Logika
    val and = 10 >= 10 && 12 > 11 //konjungsi
    println(and)
    val or = 10 > 10 || 12 > 11 //disjungsi
    println(or)
    val negasi = !true //negasi
    println(negasi)

}