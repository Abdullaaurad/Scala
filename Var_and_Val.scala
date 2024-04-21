object ValVarExample {
  def main(args: Array[String]): Unit = {
    // Define a variable using val (immutable)
    val immutableVariable: Int = 10
    // Uncommenting the line below will result in a compilation error
    // immutableVariable = 20 // Cannot reassign to a val

    // Define a variable using var (mutable)
    var mutableVariable: Int = 20
    // Value can be changed since it's a var
    mutableVariable = 30

    println(s"Immutable variable: $immutableVariable")
    println(s"Mutable variable: $mutableVariable")
  }
}
