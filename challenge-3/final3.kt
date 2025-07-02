fun main(){
    print("Masukkan Kalimat: ")
    val input = readln()
    val lc = input.lowercase()
    val hasil1 = hitungVokal(lc)
    val hasil2 = input.count()

    println("Vokal: $hasil1")
    println("Total karakter: $hasil2")
}

fun hitungVokal(kalimat: String): Int{
    var flag = 0
    val vokal = listOf('a', 'e', 'i', 'o', 'u')

    for(index in kalimat.indices){
        if(kalimat[index] in vokal){
            flag+=1
        }
    }
    return flag
}