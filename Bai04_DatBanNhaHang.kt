// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

fun datBan(
    tenKhach: String,
    soLuongKhach: Int,
    loaiBan: String = "Bàn thường"
) {
    println("Khách: $tenKhach - Số lượng: $soLuongKhach - Loại bàn: $loaiBan")
}

// Cách 1: Dùng giá trị mặc định
datBan("Nguyen Van A", 2)

// Cách 2: Truyền đủ theo đúng thứ tự
datBan("Tran Van B", 4, "Bàn VIP")

// Cách 3: Truyền bằng tên tham số
datBan(
    tenKhach = "Le Van C",
    soLuongKhach = 6,
    loaiBan = "Bàn ngoài trời"
)