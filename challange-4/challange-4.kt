fun isValidEmail(email: String): Boolean {
    return email.contains("@") && email.contains(".")
}

fun main(){
    print("Input email: ")
    val email = readLine().orEmpty()

    val status = if (isValidEmail(email)) "Valid" else "Tidak Valid"

    println("Input: $email")
    println("Status: $status")  
}