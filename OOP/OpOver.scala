class ComplexNumber(real: Double, imaginary: Double) {
    def +(other: ComplexNumber): ComplexNumber = {
        new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary)
    }

    def -(other: ComplexNumber): ComplexNumber = {
        new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary)
    }

    override def toString: String = {
        s"$real + ${imaginary}i"
    }
}

object Main {
    implicit class IntToComplex(number: Int) {
        def +(other: ComplexNumber): ComplexNumber = {
            new ComplexNumber(number + other.real, other.imaginary)
        }
    }

    def main(args: Array[String]): Unit = {
        val num1 = new ComplexNumber(3, 4)
        val num2 = new ComplexNumber(1, 2)

        val sum = num1 + num2
        println(s"Sum: $sum") // Output: Sum: 4.0 + 6.0i

        val sumWithInt = 5 + num1
        println(s"Sum with Int: $sumWithInt") // Output: Sum with Int: 8.0 + 4.0i
    }
}
