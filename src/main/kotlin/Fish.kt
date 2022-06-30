class Fish(energy: Int, weight: Int, maximumAge: Int, name: String) : Animal(energy, weight, maximumAge, name) {
    override fun move() {
        energy -= 5
        weight -= 1
        println("$name is swimming")
    }
}