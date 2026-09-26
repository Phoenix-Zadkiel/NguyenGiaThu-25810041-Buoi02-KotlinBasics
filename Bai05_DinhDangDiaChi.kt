// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

fun dinhDangDiaChi(
    soNha: String,
    duong: String,
    phuong: String = "Phường 1",
    quan: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh"
): String {
    return "$soNha, $duong, $phuong, $quan, $thanhPho"
}

println(
    dinhDangDiaChi(
        soNha = "123",
        duong = "Nguyen Trai",
        phuong = "Phuong 5",
        quan = "Quan 5",
        thanhPho = "TP. Ho Chi Minh"
    )
)