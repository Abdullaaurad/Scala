object Filter {
    val N = (x: Int) => x % 2 == 0

    def Odd(i: Int): Boolean = {
        i % 2 != 0
    }

    def main(args: Array[String]): Unit = {
        val l: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

        val k = l.filter(N)
        println("Even numbers:")
        for (item <- k) {
            println(item)
        }

        val m = l.filter(Odd)
        println("Odd numbers:")
        for (item <- m) {
            println(item)
        }
    }
}
