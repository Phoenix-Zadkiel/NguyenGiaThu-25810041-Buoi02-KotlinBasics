// Họ tên: Nguyễn Gia Thụ
// MSSV: 25810041

val kiemTraDoDai: (String) -> Boolean = { matKhau ->
    matKhau.length >= 8
}

println(kiemTraDoDai("1234567"))
println(kiemTraDoDai("12345678"))
println(kiemTraDoDai("Kotlin123"))