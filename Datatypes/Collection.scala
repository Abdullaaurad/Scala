object CollectionOperations {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)

    // Using reduce to sum all elements
    val sum = numbers.reduce((a, b) => a + b)
    println(s"Sum using reduce: $sum")

    // Using fold to sum all elements with an initial value
    val sumWithInitial = numbers.fold(0)((acc, num) => acc + num)
    println(s"Sum using fold with initial value: $sumWithInitial")

    // Using scan to get intermediate sums
    val intermediateSums = numbers.scan(0)((acc, num) => acc + num)
    println(s"Intermediate sums using scan: $intermediateSums")

    // Using reduceLeft to sum all elements (equivalent to reduce)
    val sumReduceLeft = numbers.reduceLeft((acc, num) => acc + num)
    println(s"Sum using reduceLeft: $sumReduceLeft")
  }
}
