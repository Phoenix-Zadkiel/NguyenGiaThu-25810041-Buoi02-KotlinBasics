// Ho va ten: Nguyen Gia Thu
// MSSV: Dien MSSV cua ban
fun main() {

    // Su dung while khi so lan lap phu thuoc vao dieu kien
    var dem: Int = 10

    println("Dem nguoc tu 10 ve 1:")

    while (dem >= 1) {
        println(dem)
        dem--
    }

    println()

    // Su dung repeat khi muon lap mot doan code so lan co dinh
    println("In dong co dinh 5 lan:")

    repeat(5) {
        println("Kotlin is fun!")
    }
}