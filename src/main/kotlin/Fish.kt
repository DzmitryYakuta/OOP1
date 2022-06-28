class Fish : Animal {
    constructor(energy: Int, weight: Int, maximumAge: Int, name: String) : super(energy, weight, maximumAge, name)

    override fun move() {
        energy -= 5
        weight -= 1
        println("$name is swimming")
    }
}