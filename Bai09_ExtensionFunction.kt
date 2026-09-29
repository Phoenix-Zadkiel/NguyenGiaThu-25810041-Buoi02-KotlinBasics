// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

fun String.demNguyenAm(): Int {
    var soLuong = 0

    for (kyTu in this.lowercase()) {
        if (kyTu in "aeiou") {
            soLuong++
        }
    }

    return soLuong
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) {
        return false
    }

    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}

println("Hello Kotlin".demNguyenAm())
println("Android Studio".demNguyenAm())
println("Nguyen Gia Thu".demNguyenAm())

println("2 là số nguyên tố: ${2.laSoNguyenTo()}")
println("10 là số nguyên tố: ${10.laSoNguyenTo()}")
println("17 là số nguyên tố: ${17.laSoNguyenTo()}")