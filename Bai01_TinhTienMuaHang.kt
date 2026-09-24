// Ho va ten: Nguyen Gia Thu
// MSSV: 25810041
fun main() {
    val soLuong: Int = 5
	val donGia: Double = 150000.0
	val thueVat: Double = 0.08
	
	val tienHang: Double = soLuong.toDouble() * donGia
	val tongTien: Double = tienHang * (1 + thueVat)

	println("Số lượng: $soLuong | Đơn giá: $donGia VND")
	println("Tổng tiền thanh toán (gồm 8% thuế): $tongTien VND")
}