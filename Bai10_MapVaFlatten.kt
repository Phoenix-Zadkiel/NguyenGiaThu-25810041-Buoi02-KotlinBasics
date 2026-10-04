// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

val danhSachSo = listOf(1, 2, 3, 4, 5)

val danhSachGapDoi = danhSachSo.map {
    it * 2
}

println("Kết quả map: $danhSachGapDoi")


val danhSachLongNhau = listOf(
    listOf(1, 2, 3),
    listOf(4, 5),
    listOf(6, 7, 8, 9)
)

val danhSachPhang = danhSachLongNhau.flatten()

println("Kết quả flatten: $danhSachPhang")