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
        currentAge ++
        println("$name is sleeping")
    }

    fun eat() {
        energy += 3
        weight ++
        if (Random.nextBoolean()) currentAge ++
        println("$name eats")
    }

    open fun move() {
        energy -= 5
        weight --
        if (Random.nextBoolean()) currentAge ++
        println("$name is moving")
    }

    fun tryIncrementAge() {
        val newAge = currentAge + Random.nextInt(1, 10)
        if (Random.nextBoolean()) {
            if (newAge <= maximumAge || energy > 0 || weight > 0) currentAge = newAge
        }
        println("$name age - $currentAge")
    }

    fun birth(): ChildAnimal {
        return ChildAnimal(name, maximumAge)
    }
}
