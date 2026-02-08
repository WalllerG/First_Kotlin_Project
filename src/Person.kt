class Person (val firstName: String = "Walter", val lastName: String = "Guo") {
    private var nickName: String? = null


    fun printName() {
        val nickNameToPrint = nickName ?: "no nick name"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}