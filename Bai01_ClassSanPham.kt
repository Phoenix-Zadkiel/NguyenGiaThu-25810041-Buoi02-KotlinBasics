// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

val sanPham1 = SanPham("Laptop", 15000000.0, 10)

val sanPham2 = SanPham(
    tenSanPham = "Chuột không dây",
    gia = 350000.0
)

println("Tên sản phẩm: ${sanPham1.tenSanPham}")
println("Giá: ${sanPham1.gia}")
println("Số lượng tồn kho: ${sanPham1.soLuongTonKho}")

println("Tên sản phẩm: ${sanPham2.tenSanPham}")
println("Giá: ${sanPham2.gia}")
println("Số lượng tồn kho: ${sanPham2.soLuongTonKho}")