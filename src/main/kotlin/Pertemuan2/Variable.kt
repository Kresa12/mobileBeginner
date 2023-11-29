package Pertemuan2
import java.util.Scanner
import kotlin.system.exitProcess

fun main(){
    val namaDepan : String = "Aura"
    //atau bisa juga
    val namaBelakang = "Kresa"
    val usia = 19
    //perbedaan var dan val
    //var variable yang nilainya bisa diubah
    //val variable yang nilainya tidak bisa diubah
    println("Hallo nama saya $namaDepan $namaBelakang usia saya $usia") //dolar untuk memanggil variable

    println()

    //nullable type
    //nullable type adalah fitur di kotlin untuk string kosong
    var kosong : String?= null
    var kosongLength = kosong?.length
    println(kosongLength)

    println()

    //untuk menghitung isi dari string
    val text = "esa"
    var textLength = text.length
    println(textLength)

    println()

    //char bisa di increment
    var vocal = 'A'
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)
    println("Vocal = " + vocal++)

    println()

    //collection
    var integerList = listOf(4,2,1,5,1,2)
    var integerset = setOf(4,2,1,5,1,2)
    var capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
        1 to "Indonesia",
        2 to "England",
        3 to "India"
    )

    println(integerList)
    println(integerList[4])

    println(integerset)
    println(integerset)

    println(capital)
    println(capital["Jakarta"])

    println()

    //mutableList
    val anyList = mutableListOf('A', "Kotlin", 3, true)
    anyList.add('D')
    anyList.add(0, "Tambahan")
    anyList.removeAt(3)
    anyList[3]= false //merubah value
    println(anyList)

}

