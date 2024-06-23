object Null_null{
    def main(args: Array[String]):Unit={
        val someString: String = null 

        val someNull: Null = null 
        println(someNull)
        // val anotherNull: Null = new Null()

        def exampleFunction(x: AnyRef): Unit = {
        println(x)
        }

        exampleFunction(null)
        // exampleFunction(5)

    }
}