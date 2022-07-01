import kotlin.random.Random

open class Animal(
    protected var energy: Int,
    protected var weight: Int,
    protected val maximumAge: Int,
    protected val name: String
) {
    private var currentAge = Random.nextInt(1, 10)
    private val isTooOld = currentAge >= maximumAge
    open val isDead: Boolean
        get() {
            return isTooOld || energy <= 0 || weight <= 0
        }

    fun sleep() {
        energy += 5
        currentAge += 1
        println("$name is sleeping")
    }

    fun eat() {
        energy += 3
        weight += 1
        println("$name eats")
    }

    open fun move() {
        energy -= 5
        weight -= 1
        println("$name is moving")
    }

    fun tryIncrementAge() {
        if (Random.nextBoolean()) {
            if (!isTooOld || energy > 0 || weight > 0) currentAge += Random.nextInt(1, 10)
        }
        println("$name age - $currentAge")
    }

    fun birth(): ChildAnimal {
        energy -= 5
        weight -= 2
        return ChildAnimal(name, maximumAge)
    }
}