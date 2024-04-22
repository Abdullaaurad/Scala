object Y{
    def main(args: Array[String]): Unit ={
        val numbers = List(1, 2, 3, 4, 5)
        val doubledNumbers = for (num <- numbers) yield num * 2

        println(doubledNumbers) // Output: List(2, 4, 6, 8, 10)
    }
}