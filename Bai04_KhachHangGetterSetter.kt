// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

class KhachHang(
    var ho: String,
    var ten: String
) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split(" ", limit = 2)
            ho = parts[0]
            ten = if (parts.size > 1) parts[1] else ""
        }
}

val khachHang = KhachHang("Nguyen", "A")

println(khachHang.hoTen)

khachHang.ten = "B"
println(khachHang.hoTen)

khachHang.hoTen = "Tran Van C"

println(khachHang.ho)
println(khachHang.ten)
println(khachHang.hoTen)