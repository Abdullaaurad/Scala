object ListExample {
    def main(args: Array[String]): Unit = {
        // Creating a list of integers
        val numbers = List(1, 2, 3, 4, 5)

        // Accessing elements of the list
        println("Elements of the list:")
        for (num <- numbers) {
          println(num)
        }

        // Accessing elements by index
        val firstElement = numbers(0)
        val thirdElement = numbers(2)
        println(s"First element: $firstElement, Third element: $thirdElement")

        // Concatenating lists
        val moreNumbers = List(6, 7, 8)
        val combinedList = numbers ++ moreNumbers
        println("Combined list:")
        for (num <- combinedList) {
          println(num)
        }

        // Adding elements to the beginning of the list
        val newList = 0 :: numbers
        println("New list with added element:")
        for (num <- newList) {
          println(num)
        }

        // Length of the list
        val length = numbers.length
        println(s"Length of the list: $length")

        // Checking if a list is empty
        val isEmpty = numbers.isEmpty
        println(s"Is the list empty? $isEmpty")

        // Sorting a list
        val sortedList = combinedList.sorted
        println("Sorted list:")
        for (num <- sortedList) {
          println(num)
        }

        // Filtering elements in a list
        val filteredList = combinedList.filter(_ % 2 == 0) // Keep only even numbers
        println("Filtered list (even numbers):")
        for (num <- filteredList) {
          println(num)
        }

        // Mapping elements in a list
        val doubledList = numbers.map(_ * 2)
        println("Doubled list:")
        for (num <- doubledList) {
          println(num)
        }

        // Reducing elements in a list
        val sum = numbers.reduce(_ + _)
        println(s"Sum of elements in the list: $sum")
    }
}
