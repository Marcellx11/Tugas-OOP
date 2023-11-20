package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.ArithmeticException

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        val result = divideNumbers(10,0)
        println("Result: $result")
    } catch (e: ArithmeticException){
        println("Exception caugh: ${e.message}")
    } catch (e: Exception) {
        println("General exception caught: ${e.message}")
    }finally {
        println("finally block executed")
    }

}

fun divideNumbers(a: Int, b: Int): Int {
    return a / b
}