package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    val firstName = "Fikri"
    val secondName = "Marcellino"
    val age = 22

    var single = true

    println("$firstName $secondName")
    println(age)
    println("status saya sekarang masih $single")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama kelompok : $groupId")
    println("Anggota kelompok : $groupMember")
    println("Seksi : $session")

    return "Saya dari kelompok $groupId sesi $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    return listOf(
        "mobile : Fikri, Fiki, Adzan, Irma, Annga",
        "web : Risma, Hilda, Beta, Fikra, Adib"
    )
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Pupu", "Kak Jessica")
    val countOfGroup = arrayOf<String>(
        "Fikri",
        "Fiki",
        "Adzan",
        "Irma",
        "Angga",
        "Risma",
        "Hilda",
        "Beta",
        "Fikra",
        "Adib"
    )

    return mentor.count() + countOfGroup.count()
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("GrowZen", listOf(
        "Fikri",
        "Fiki",
        "Adzan",
        "Irma",
        "Angga",
        "Risma",
        "Hilda",
        "Beta",
        "Fikra",
        "Adib"
    ), "Afternoon")

}