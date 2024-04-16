// Define a basic Scala object
object Hello{
  // Main method, entry point of the program
  def main(args: Array[String]): Unit = {
    // Print "Hello, World!" to the console
    println("Hello, World!")
    
    // Call a function
    val result = addNumbers(5, 10)
    println("Result is: " + result)
  }

  // Function to add two numbers
  def addNumbers(a: Int, b: Int): Int = {
    a + b // Return the sum of a and b
  }
}
