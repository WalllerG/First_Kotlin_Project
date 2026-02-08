interface PeronInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printName()
    }
}

interface SessionInfoProvider {
    val sessionId: String
    fun getSessionId(){
        println(sessionId)
    }
}


class BasicInfoProvider : PeronInfoProvider,SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override val sessionId: String
        get() = "BIP"

}


fun checkType (personInfoProvider: PeronInfoProvider) {
    if (personInfoProvider is SessionInfoProvider) {
        println("Is a sessionInfoProvider")
        personInfoProvider.getSessionId()
    }
    else{
        println("Is not a sessionInfoProvider")
    }
}


fun main() {
    val provider = BasicInfoProvider()
    val person = Person("Walter","Guo")
    provider.printInfo(person)
    checkType(provider)
}