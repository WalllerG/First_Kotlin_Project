

fun main() {
    val interestingThings = arrayOf("Kotlin","Java","hello")
    sayHello(greeting = "Hi", items = interestingThings)
    val person = Person("Walter","Guo")
    person.printName()
}

fun sayHello(greeting: String, vararg items:String) {
    items.forEach{ items ->
        println("$greeting, $items")
    }
}

