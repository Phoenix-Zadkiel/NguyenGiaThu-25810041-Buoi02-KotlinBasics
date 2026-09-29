// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

class TaiKhoanNganHang(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    fun napTien(soTien: Double) {
        soDu += soTien
    }

    fun rutTien(soTien: Double): Boolean {
        return if (soDu >= soTien) {
            soDu -= soTien
            true
        } else {
            false
        }
    }
}

val taiKhoan = TaiKhoanNganHang("TK001", 1000000.0)

println("Số dư ban đầu: ${taiKhoan.soDu}")

taiKhoan.napTien(500000.0)
println("Sau khi nạp tiền: ${taiKhoan.soDu}")

val ketQuaRut1 = taiKhoan.rutTien(300000.0)
println("Rút 300000: $ketQuaRut1")
println("Số dư: ${taiKhoan.soDu}")

val ketQuaRut2 = taiKhoan.rutTien(2000000.0)
println("Rút 2000000: $ketQuaRut2")
println("Số dư: ${taiKhoan.soDu}")