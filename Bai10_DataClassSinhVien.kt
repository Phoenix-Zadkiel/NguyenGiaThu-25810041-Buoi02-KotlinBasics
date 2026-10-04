// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

val sinhVien1 = SinhVien(
    "25810041",
    "Nguyen Gia Thu",
    8.5
)

val sinhVien2 = SinhVien(
    "25810041",
    "Nguyen Gia Thu",
    8.5
)

println(sinhVien1)

println(sinhVien1 == sinhVien2)

val sinhVien3 = sinhVien1.copy(
    diemTrungBinh = 9.0
)

println(sinhVien3)