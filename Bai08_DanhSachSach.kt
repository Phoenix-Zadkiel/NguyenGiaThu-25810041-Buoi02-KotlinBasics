// Ho va ten: Nguyen Gia Thu
// MSSV: Dien MSSV cua ban
fun main() {
    // Tao danh sach 5 cuon sach ban dau
    val danhSachSach = mutableListOf(
        "Lap trinh Kotlin",
        "Clean Code",
        "Dac Nhan Tam",
        "Nha Gia Kim",
        "Tuoi Tre Dang Gia Bao Nhieu"
    )

    println("Danh sach sach ban dau:")
    println(danhSachSach)

    danhSachSach.add("Atomic Habits")
    danhSachSach.add("The Pragmatic Programmer")
    danhSachSach.remove("Dac Nhan Tam")
    danhSachSach.sort()
    println()
    println("Danh sach sach sau khi them, xoa va sap xep:")
    println(danhSachSach)
}