// Base class
class Animal(val name: String) {
  def makeSound(): Unit = println("Animal sound")
}

// Subclass inheriting from Animal
class Dog(name: String, val breed: String) extends Animal(name) {
  def bark(): Unit = println("Woof!")
}

object InheritanceExample {
  def main(args: Array[String]): Unit = {
    // Create an instance of Dog
    val dog = new Dog("Buddy", "Golden Retriever")

    // Access properties and methods of Dog
    println(s"Name: ${dog.name}, Breed: ${dog.breed}")
    dog.makeSound() // Inherited method from Animal
    dog.bark()      // Method specific to Dog
  }
}
