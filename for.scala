object ForLoopExample {
  def main(args: Array[String]): Unit = {
    // Using a for loop with a range
    println("\t\tUsing To")
    for (i <- 1 to 5) {            //will take i as variable 
      println(s"Value of i: $i")
    }
    println("\t\tUsing Until")
    for (i <- 1 until 5) {          
      println(s"Value of i: $i")
    }

    // Using a for loop with a collection
    val fruits = Array("Apple", "Banana", "Orange")
    for (fruit <- fruits) {
      println(s"Current fruit: $fruit")
    }

    // Using a for loop with multiple generators
    for {
      i <- 1 to 3
      j <- 1 to 2
    } {
      println(s"i = $i, j = $j")
    }

    // Using a for loop with guards (if condition)
    for (i <- 1 to 10 if i % 2 == 0) {
      println(s"Even number: $i")
    }

    // Using a for loop with yield to create a new collection
    val doubledNumbers = for (i <- 1 to 5) yield i * 2
    println(s"Doubled numbers: $doubledNumbers")
  }
}
