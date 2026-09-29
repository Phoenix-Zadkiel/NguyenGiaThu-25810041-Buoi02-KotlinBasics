// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

// nv1.maNhanVien
// Lỗi biên dịch vì maNhanVien không được khai báo bằng val hoặc var nên không phải thuộc tính của class.

val nv1 = NhanVien("NV001", "Nguyen Van A", 12000000.0)
val nv2 = NhanVien("Nguyen Van B")

println("Nhân viên 1: ${nv1.ten} - ${nv1.luongThang}")
println("Nhân viên 2: ${nv2.ten} - ${nv2.luongThang}")