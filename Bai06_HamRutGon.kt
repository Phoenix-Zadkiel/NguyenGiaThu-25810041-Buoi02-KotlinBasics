// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

fun binhPhuongDayDu(n: Int): Int {
    return n * n
}

fun binhPhuongRutGon(n: Int) = n * n


fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}

fun chuViHinhVuongRutGon(canh: Double) = canh * 4


fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}

fun laSoChanRutGon(n: Int) = n % 2 == 0


println(binhPhuongDayDu(5))
println(binhPhuongRutGon(5))

println(chuViHinhVuongDayDu(4.0))
println(chuViHinhVuongRutGon(4.0))

println(laSoChanDayDu(10))
println(laSoChanRutGon(10))