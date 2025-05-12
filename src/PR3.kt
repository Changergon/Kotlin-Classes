open class Animal(val food: String, val location: String) {
    open fun makeNoise() {
        println("Такое-то животное спит")
    }

    open fun eat() {
        println("Животное ест $food")
    }

    fun sleep() {
        println("Животное спит в $location")
    }
}

class Dog(food: String, location: String, val breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Собака породы $breed лает: Гав-гав!")
    }

    override fun eat() {
        println("Собака ест $food")
    }
}

class Cat(food: String, location: String, val color: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Кот цвета $color мяукает: Мяу!")
    }

    override fun eat() {
        println("Кот ест $food")
    }
}

class Horse(food: String, location: String, val speed: Int) : Animal(food, location) {
    override fun makeNoise() {
        println("Лошадь со скоростью $speed км/ч ржет: Иго-го!")
    }

    override fun eat() {
        println("Лошадь ест $food")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Еда: ${animal.food}, Место обитания: ${animal.location}")
    }
}

fun main() {
    val animals = arrayOf(
        Dog("кость", "будка", "овчарка"),
        Cat("рыба", "дом", "рыжий"),
        Horse("сено", "cтойло", 60)
    )

    val vet = Veterinarian()

    for (animal in animals) {
        vet.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        animal.sleep()
        println()
    }
}