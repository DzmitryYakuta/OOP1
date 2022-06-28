import kotlin.random.Random

class ChildAnimal : Animal {
    constructor(
        name: String,
        maximumAge: Int,
        energy: Int = Random.nextInt(1,10),
        weight: Int = Random.nextInt(1,5)
        ) : super(name = name, maximumAge = maximumAge, energy = energy, weight = weight)

    init {
        println("Birth $name. Energy - $energy. Weight - $weight.")
    }

}