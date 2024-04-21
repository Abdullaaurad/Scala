object VarExample {
  def main(args: Array[String]): Unit = {
    val age: Int = 30
    val pi: Double = 3.14159
    val isRaining: Boolean = false
    val firstLetter: Char = 'A'
    val name: String = "Alice"
    val numbers: Array[Int] = Array(1, 2, 3, 4, 5)
    val numbersList: List[Int] = List(1, 2, 3, 4, 5)
    val personInfo: (String, Int, Boolean) = ("Alice", 30, true)

    // Print variables with their data types
    println(s"age: Int = $age")
    println(s"pi: Double = $pi")
    println(s"isRaining: Boolean = $isRaining")
    println(s"firstLetter: Char = $firstLetter")
    println(s"name: String = $name")
    println(s"numbers: Array[Int] = ${numbers.mkString(", ")}")
    println(s"numbersList: List[Int] = $numbersList")
    println(s"personInfo: (String, Int, Boolean) = $personInfo")
  }
}
