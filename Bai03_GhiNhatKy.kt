// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

fun ghiNhatKy1(hoatDong: String): Unit {
    println("[NHAT KY] $hoatDong")
}

fun ghiNhatKy2(hoatDong: String) {
    println("[NHAT KY] $hoatDong")
}

// Kotlin tự suy luận kiểu trả về Unit khi hàm không trả về giá trị hữu ích.
// Vì vậy hai cách khai báo trên là tương đương.

ghiNhatKy1("Bat dau hoc Kotlin")
ghiNhatKy2("Hoan thanh bai tap")