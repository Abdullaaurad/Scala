object ReqWithAssert {
  def some(x: Int): Int = {
    assert(x > 0, "x must be positive")
    x
  }

  def main(args: Array[String]): Unit = {
    println(some(5))
    //println(some(-2)) // This will throw an AssertionError
  }
}
