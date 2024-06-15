object MathOperations {
    // Overloaded method to add two integers
    def add(a: Int, b: Int): Int = a + b

    // Overloaded method to add two doubles
    def add(a: Double, b: Double): Double = a + b

    // Overloaded method to concatenate two strings
    def add(a: String, b: String): String = a + b
}

object lol {
    def main(args: Array[String]): Unit = {
        val sumIntegers = MathOperations.add(3, 5)
        println(s"Sum of integers: $sumIntegers") // Output: Sum of integers: 8

        val sumDoubles = MathOperations.add(3.5, 2.5)
        println(s"Sum of doubles: $sumDoubles") // Output: Sum of doubles: 6.0

        val concatenatedStrings = MathOperations.add("Hello, ", "Scala")
        println(s"Concatenated strings: $concatenatedStrings") // Output: Concatenated strings: Hello, Scala
    }
}
