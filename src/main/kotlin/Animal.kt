import kotlin.random.Random

open class Animal(protected open var energy: Int,
                  protected open var weight: Int,
                  protected open val maximumAge: Int,
                  protected open val name: String) {
    private var currentAge = Random.nextInt(1,10)
    val isTooOld = currentAge >= maximumAge

    fun sleep () {
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
        val incrementAge = Random.nextInt(1,10)
        val newAge = currentAge + incrementAge
        if (Random.nextBoolean()) {
            if (newAge <= this.maximumAge) currentAge = newAge
        }
        println("$name, age is $currentAge")
    }

    fun birth() {
        val childAnimal = ChildAnimal(name,maximumAge)
    }

    fun condition() {
        println("$name. Age - $currentAge. Energy - $energy. Weight - $weight.")
    }

}