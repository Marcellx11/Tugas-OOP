package id.infinitelearning.KotlinSubmission.exercise2

import java.time.LocalDate

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    println("Bilangan genap:")
    for (i: Int in 1..1000) {
        if (i % 2 == 0) {
            println("$i")
        }
    }


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst... */
    // Buat di bawah sini

    val monthMap = mapOf(
        "jan" to "januari",
        "feb" to "februari",
        "mart" to "maret",
        "apr" to "april",
        "mei" to " mei",
        "jun" to "juni",
        "jul" to "juli",
        "ags" to "agustus",
        "sep" to "september",
        "oct" to "october",
        "nov" to "november",
        "des" to "desember"
    )

    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...*/
    // Buat di bawah sini
    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val localMothNow = LocalDate.now().month
    val monthNow = localMothNow.toString().lowercase().capitalize()
    val birthMonth = monthMap["july"]

    println("It's {$monthNow} now, I was born in {$birthMonth")
}