// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

class TaiKhoanNganHang(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
}

val taiKhoan1 = TaiKhoanNganHang("TK001", 5000000.0)
val taiKhoan2 = TaiKhoanNganHang("TK002", -1000000.0)