object ArrayExample {
  def main(args: Array[String]): Unit = {
    // Creating an array of integers
    val numbers = Array(1, 2, 3, 4, 5)

    val size = 5
    val array = Array.ofDim[Int](size)

    // Accessing elements of the array
    println("Elements of the array:")
    for (num <- numbers) {
      println(num)
    }

    // Accessing elements by index
    val firstElement = numbers(0)
    val thirdElement = numbers(2)
    println(s"First element: $firstElement, Third element: $thirdElement")

    // Updating elements in the array
    numbers(1) = 10
    numbers(3) = 20

    println("Updated elements of the array:")
    for (num <- numbers) {
      println(num)
    }

    // Length of the array
    val length = numbers.length
    println(s"Length of the array: $length")

    // Creating an array of strings
    val fruits = Array("Apple", "Banana", "Cherry", "Date")

    println("Elements of the string array:")
    for (fruit <- fruits) {
      println(fruit)
    }

    // Concatenating arrays
    val combinedArray = numbers ++ Array(6, 7, 8)
    println("Combined array:")
    for (num <- combinedArray) {
      println(num)
    }

    // Sorting an array
    val sortedArray = combinedArray.sorted
    println("Sorted array:")
    for (num <- sortedArray) {
      println(num)
    }

    // Checking if an array contains an element
    val containsFive = numbers.contains(5)
    val containsTwelve = numbers.contains(12)
    println(s"Does the array contain 5? $containsFive")
    println(s"Does the array contain 12? $containsTwelve")

    val list = List(1, 2, 3, 4)
    val tailList = list.tail
    println(tailList) // Output: List(2, 3, 4)

  }
}
