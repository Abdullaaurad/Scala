object ConstructorExample {
  def main(args: Array[String]): Unit = {
    // Create instances using different constructors
    val person1 = new Person("Alice", 30)
    val person2 = new Person("Bob")
    val person3 = new Person()

    // Print information about the persons
    println(person1)
    println(person2)
    println(person3)
  }

  class Person(val name: String, var age: Int) {         // Primary constructor
    print("Enter a number =")
    var x = scala.io.StdIn.readInt()
    // Auxiliary constructor 1
    def this(name: String)={
      this(name, 0) // Calls the primary constructor with age initialized to 0
    }

    // Auxiliary constructor 2
    def this()={
      this("Unknown") // Calls the auxiliary constructor with name initialized to "Unknown"
    }

    // Override toString method for pretty printing
    override def toString: String = s"Person(name=$name, age=$age)"
  }
}
