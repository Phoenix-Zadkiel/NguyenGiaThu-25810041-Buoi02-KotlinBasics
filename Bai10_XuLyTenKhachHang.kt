// Ho va ten: Nguyen Gia Thu
// MSSV: 25810041

fun xuLyTenKhachHang(tenKhachHang: String?) {
    val doDaiTen: Int? = tenKhachHang?.length
    println("Do dai ten khach hang: $doDaiTen")

    val tenHienThi: String = tenKhachHang ?: "Khach vang lai"
    println("Ten khach hang: $tenHienThi")
}

fun main() {
    val ten1: String? = "Nguyen Gia Thu"
    xuLyTenKhachHang(ten1)

    println()

    val ten2: String? = null
    xuLyTenKhachHang(ten2)

    println()

    val tenChacChan: String? = "Kotlin"
    val doDaiChacChan: Int = tenChacChan!!.length

    println("Do dai ten chac chan: $doDaiChacChan")
}