object con{
    def main(args: Array[String]): Unit ={
        val numbers = List(1, 2, 3, 4, 5)

        // Using if statement to skip odd numbers
        for (num <- numbers) {
            if (num % 2 != 0) {
                // Skip odd numbers
            } else {
                println(num)
            }
        }

        // Using filter to skip odd numbers
        numbers.filter(_ % 2 == 0).foreach(println)
    }
}

//no direct continue keyword like in languages such as Java or C