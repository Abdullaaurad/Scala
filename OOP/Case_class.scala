case class Person(name: String, age: Int)

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val person1 = Person("Alice", 30) // No need for 'new'
    val person2 = Person("Bob", 25)

    // toString method is automatically implemented
    println(person1)
    println(person2)

    // Pattern matching
    val description = person1 match {
      case Person(name, age) => s"$name is $age years old"
    }
    println(description)

    // Automatic equality check
    println(person1 == person2) // Compares values
    val p2=person1.copy()
    println (person1)
  }
}
