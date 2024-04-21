object HigherOrderFunctionsExample {
  def applyOperation(x: Int, y: Int, operation: (Int, Int) => Int): Int = {
    operation(x, y)
  }

  def add(x: Int, y: Int): Int = x + y

  def subtract(x: Int, y: Int): Int = x - y

  def multiply(x: Int, y: Int): Int = x * y

  def main(args: Array[String]): Unit = {
    val a = 5
    val b = 3

    val resultAdd = applyOperation(a, b, add)
    println(s"Addition result: $resultAdd")

    val resultSubtract = applyOperation(a, b, subtract)
    println(s"Subtraction result: $resultSubtract")

    val resultMultiply = applyOperation(a, b, multiply)
    println(s"Multiplication result: $resultMultiply")
  }
}
