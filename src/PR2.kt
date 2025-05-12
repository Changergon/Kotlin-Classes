class Message(private val username: String) {
    fun introduce() {
        println("Привет, меня зовут $username!")
    }
}

fun main() {
    val message = Message("Дмитрий")
    message.introduce()
}