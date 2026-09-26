// Họ tên:Nguyễn Gia Thụ
// MSSV: 25810041

fun xuLyVanBan(
    vanBan: String,
    xuLy: (String) -> String
): String {
    return xuLy(vanBan)
}

fun vietHoa(vanBan: String): String {
    return vanBan.uppercase()
}

println(
    xuLyVanBan("hello kotlin") { it.uppercase() }
)

println(
    xuLyVanBan("hello kotlin", ::vietHoa)
)

println(
    xuLyVanBan("hello kotlin") {
        it.replace("kotlin", "Kotlin")
    }
)