// Ho va ten: Nguyen Gia Thu
// MSSV: Dien MSSV cua ban
fun main() {
    val soDuBanDau: Double = 5000000.0
    var soDuHienTai: Double = soDuBanDau

    println("So du ban dau: $soDuHienTai VND")

    val tienGui: Double = 2000000.0
    soDuHienTai += tienGui

    println("Sau khi gui 2.000.000 VND: $soDuHienTai VND")
    val tienRut: Double = 1500000.0
    soDuHienTai -= tienRut

    println("Sau khi rut 1.500.000 VND: $soDuHienTai VND")
}