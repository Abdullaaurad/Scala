object Null{
    def error(message: String): Nothing = {
        throw new RuntimeException(message)
    }

    val result: Int = if (true) 10 else error("Error occurred") // This line will never execute

    def main(args: Array[String]):Unit ={
        var str: String = null
        println(str)
    }
}

/*
Nothing:

Type
Bottom type of the type hierarchy
Used for functions that do not return normally (e.g., throwing exceptions)
Nil:

Case object
Represents an empty list (List[Nothing])
Used to signify an empty list
null:

Singleton value
Represents the absence of a value (a reference to no object)
Assignable to any reference type but not to value types
*/