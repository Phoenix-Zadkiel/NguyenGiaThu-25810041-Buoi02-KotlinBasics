// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

val danhSachNhacCu = listOf(
    "Guitar",
    "Piano",
    "Trống",
    "Sáo",
    "Violin",
    "Guitar điện"
)

val chuCai = 'G'

val ketQuaEager = danhSachNhacCu.filter {
    it.startsWith(chuCai, ignoreCase = true)
}

println("Lọc thông thường: $ketQuaEager")

val ketQuaLazy = danhSachNhacCu
    .asSequence()
    .filter {
        it.startsWith(chuCai, ignoreCase = true)
    }
    .toList()

println("Lọc bằng Sequence: $ketQuaLazy")

// Sequence phù hợp khi xử lý dữ liệu lớn hoặc có nhiều bước biến đổi,
// vì các phép xử lý có thể được thực hiện theo kiểu lazy.