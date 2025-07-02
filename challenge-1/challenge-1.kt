fun main() {
    print("Masukkan nilai (pisahkan dengan koma): ")
    val input = readLine().orEmpty()
    
    val nilaiList = input
        .split(",")
        .mapNotNull { it.trim().toIntOrNull() }
    
    if (nilaiList.isEmpty()) {
        println("Tidak ada nilai valid.")
        return
    }
    
    val tertinggi = nilaiList.maxOrNull() ?: 0
    val terendah  = nilaiList.minOrNull() ?: 0
    val rata      = nilaiList.average()
    
    println("Nilai: $nilaiList")
    println("Tertinggi: $tertinggi")
    println("Terendah: $terendah")
    println("Rata-rata: ${"%.2f".format(rata)}")
}
