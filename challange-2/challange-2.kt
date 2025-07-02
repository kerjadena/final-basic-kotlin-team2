fun main(){
    val tamu: List<String?> = listOf("Budi", null, "Tania", null, "Reza")

    val terdaftar = tamu.filterNotNull()
    val tanpaNama = tamu.count{ it == null}

    println("Tamu Terdaftar: ${terdaftar.joinToString(", ")}")
    println("Jumlah tamu tanpa nama: $tanpaNama")
}
