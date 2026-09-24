// Ho va ten: Nguyen Gia Thu
// MSSV: Dien MSSV cua ban
fun main() {
    var a: Int = 0
    var b: Int = 1
    var viTri: Int = 0

    for (i in 0..100) {
        if (a >= 100) {
            break
        }

        println("Vi tri $viTri: $a")

        val tiepTheo: Int = a + b
        a = b
        b = tiepTheo
        viTri++
    }
}