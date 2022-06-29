import kotlin.random.Random

fun main() {

//    val elephant = Animal(50, 500, 25, "Elephant")
//    val fish = Fish(30, 2, 5, "Fish")
//    val bird = Bird(40, 5, 5, "Bird")
//    val dog = Dog(50, 30, 15, "Dog")

    var zoo = NatureReserve()
    println(zoo.zoo.size)
    zoo.zoo.forEach { println(it.condition()) }
    val n = 5

    for (i in 1..n) {
        for (j in 0 until zoo.zoo.size) {
            var choice = Random.nextInt(1, 4)
            when (choice) {
                1 -> zoo.zoo[j].sleep()
                2 -> zoo.zoo[j].eat()
                3 -> zoo.zoo[j].move()
                else -> zoo.zoo[j].birth()
            }
        }
        zoo.zoo.removeAll { it.isTooOld }
    }

    zoo.zoo.forEach { println(it.condition()) }
}