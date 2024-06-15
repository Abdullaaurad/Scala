object MapExample {
    def main(args: Array[String]): Unit = {
        val immutableMap = Map("a" -> 1, "b" -> 2, "c" -> 3)
        println(immutableMap)
        val valueA = immutableMap("a")
        println(valueA) // Output: 1

        val valueB = immutableMap.getOrElse("b", 0)
        println(valueB) // Output: 2

        val valueD = immutableMap.getOrElse("d", 0)
        println(valueD) // Output: 0
        
        val reducedMap = immutableMap - "b"
        println(reducedMap) // Output: Map(a -> 1, c -> 3)

        import scala.collection.mutable

        val mutableMap = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
        println(mutableMap) // Output: Map(a -> 1, b -> 2, c -> 3)

        val keys = immutableMap.keys
        println(keys) // Output: Set(a, b, c)

        val values = immutableMap.values
        println(values) // Output: List(1, 2, 3)

    }
}