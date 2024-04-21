object Dell {
  def Add(x: Int, y: Int): Int = {
    x + y
  }

  def Subtract(x: Int, y: Int): Int = x - y

  def Multiply(x: Int, y: Int): Int = {
    return x * y
  }

  def divide(x: Int, y: Int) = x / y

  object Math {
    def square(x: Int): Int = x * x
  }

  def main(args: Array[String]): Unit = {
    var x: Int = 5
    var y: Int = 3

    var l = Multiply(x, y)
    println(s"the value of $x*$y = $l")

    var k = Add(x, y)                       //we can use '*' as function name without using 'Add'
    println(s"the value of $x+$y = $k")     //not as operator overloading but giving it different name using symbols

    var m = Subtract(x, y)
    println(s"the value of $x-$y = $m")

    var n = divide(x, y)
    println(s"the value of $x/$y = $n")

    var s = Math.square(4)
    println(s"the square of $x is $s")
  }
}
