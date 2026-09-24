// Ho va ten: Nguyen Gia Thu
// MSSV: Dien MSSV cua ban
fun main() {
    val diemSinhVien: Array<Double> = arrayOf(
        8.5, 7.0, 9.0, 6.5, 8.0,
        7.5, 9.5, 5.5, 6.0, 8.8
    )

    var tongDiem: Double = 0.0
    var diemCaoNhat: Double = diemSinhVien[0]
    var diemThapNhat: Double = diemSinhVien[0]

    for (diem in diemSinhVien) {
        tongDiem += diem

        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }

        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh: Double = tongDiem / diemSinhVien.size

    println("Diem trung binh cua lop: %.2f".format(diemTrungBinh))
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}