fun main(){

    var money: List<Int> = listOf(20000, 50000, 1000, 3000, 69000)
    println("Pengeluaran: $money")
    print("Total: ")
    println(money.sum())
    print("Terbesar: ")
    println(money.maxOrNull())
    print("Terkecil: ")
    println(money.minOrNull())
}