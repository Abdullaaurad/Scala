object MyDSL {
    // Define symbols using string literals
    val doThis = "Performing action"
    val doThat = "Performing another action"

    // Define a method that uses pattern matching with symbols
    def execute(symbol: Symbol): Unit = {
        symbol match {
            case Symbol("doThis") => println("Executing action 1")
            case Symbol("doThat") => println("Executing action 2")
            case _ => println("Unknown action")
        }
    }

    def main(args: Array[String]): Unit = {
        // Usage of symbols and DSL methods
        val mySymbol1: Symbol = Symbol("doThis")
        val mySymbol2: Symbol = Symbol("doThat")

        MyDSL.execute(mySymbol1) // Output: Executing action 1
        MyDSL.execute(mySymbol2) // Output: Executing action 2
    }
}
