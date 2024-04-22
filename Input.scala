object UserInputExample {
  def main(args: Array[String]): Unit = {

    print("Please enter your name =")
    val name1 = scala.io.StdIn.readLine()

    print("Please enter your Age =")
    val age1 = scala.io.StdIn.readInt()

    print("Enter your Height =")
    var height1: Double = scala.io.StdIn.readDouble()

    println(s"Hello, $name1 you are $age1 old and your height is $height1")

    // Prompt the user to enter their name
    print("Please enter your name: ")
    val name = scala.io.StdIn.readLine()

    // Prompt the user to enter their age with input validation
    var age: Option[Int] = None
    while (age.isEmpty) {
      print("Please enter your age (must be a positive integer): ")
      try {
        val input = scala.io.StdIn.readLine()
        age = Some(input.toInt)
        if (age.get <= 0) {
          age = None
          println("Invalid input. Age must be a positive integer.")
        }
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Age must be a positive integer.")
      }
    }

    // Prompt the user to enter their height with input validation
    var height: Option[Double] = None
    while (height.isEmpty) {
      print("Please enter your height in meters (e.g., 1.75): ")
      try {
        val input = scala.io.StdIn.readLine()
        height = Some(input.toDouble)
        if (height.get <= 0) {
          height = None
          println("Invalid input. Height must be a positive number in meters.")
        }
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Height must be a positive number in meters.")
      }
    }

    // Display user information
    println(s"Hello, $name! You are ${age.get} years old and your height is ${height.get} meters.")
  }
}
