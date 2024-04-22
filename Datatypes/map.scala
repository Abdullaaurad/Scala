object MapExample {
  def main(args: Array[String]): Unit = {
    // Define a list of integers
    val numbers = List(1, 2, 3, 4, 5)

    // Use map to double each element in the list
    val doubledNumbers = numbers.map(num => num * 2)

    // Print the original list and the doubled list
    println("Original numbers: " + numbers)
    println("Doubled numbers: " + doubledNumbers)
  }
}
