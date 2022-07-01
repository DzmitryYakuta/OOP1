import kotlin.random.Random

open class NatureReserve {
    private val bird1 = Bird(5, 5, 5, "Bird 1")
    private val bird2 = Bird(4, 7, 8, "Bird 2")
    private val bird3 = Bird(6, 5, 7, "Bird 3")
    private val bird4 = Bird(3, 5, 2, "Bird 4")
    private val bird5 = Bird(5, 5, 5, "Bird 5")

    private val fish1 = Fish(5, 3, 5, "Fish 1")
    private val fish2 = Fish(10, 5, 8, "Fish 2")
    private val fish3 = Fish(20, 15, 15, "Fish 3")

    private val dog1 = Dog(20, 10, 12, "Dog 1")
    private val dog2 = Dog(10, 5, 5, "Dog 2")

    private val animal1 = Animal(20, 5, 3, "Animal 1")
    private val animal2 = Animal(30, 15, 30, "Animal 2")

    private var zoo =
        mutableListOf(bird1, bird2, bird3, bird4, bird5, fish1, fish2, fish3, dog1, dog2, animal1, animal2)

    fun zooLife() {
        println("Number of animals in the zoo - ${zoo.size}")
        val n = 5

        for (i in 1..n) {
            for (j in 0 until zoo.size) {
                when (Random.nextInt(1, 5)) {
                    1 -> zoo[j].sleep()
                    2 -> zoo[j].eat()
                    3 -> zoo[j].move()
                    else -> zoo.add(zoo[j].birth())
                }
            }
            zoo.removeAll { it.isDead }
            if (zoo.size <= 0) {
                println("All animals are dead")
                break
            }
        }
        println("Number of animals in the zoo - ${zoo.size}")
    }
}