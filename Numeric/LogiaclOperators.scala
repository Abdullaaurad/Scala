object Use {
    def main(args: Array[String]): Unit = {
    val a = 5 // binary: 101
    val b = 3 // binary: 011

    val result = (a & b) // Bitwise AND: 001 (decimal 1)
    println(result) // Output: 1

    val a1 = 5 // binary: 101
    val b1 = 3 // binary: 011

    val result1 = (a1 | b1) // Bitwise OR: 111 (decimal 7)
    println(result1) // Output: 7

    val a2 = 5 // binary: 101

    val result2 = (~a2) // Bitwise NOT: 11111010 (decimal -6 in two's complement)
    println(result2) // Output: -6

    }
}