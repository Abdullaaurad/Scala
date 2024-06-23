object Equilateral{
    // Superclass Polygon
    class Polygon(val size: Double)

    // Subclass Square
    class Square(size: Double) extends Polygon(size) {
      def area(): Double = size * size

      def perimeter(): Double = 4 * size
    }

    // Subclass EquilateralTriangle
    class EquilateralTriangle(size: Double) extends Polygon(size) {
      def area(): Double = {
        val height = size * Math.sqrt(3) / 2
        size * height / 2
      }

      def perimeter(): Double = 3 * size
    }

    def main(args: Array[String]):Unit={
        val square = new Square(5.0)
        println("Square Area: " + square.area()) // Output: Square Area: 25.0
        println("Square Perimeter: " + square.perimeter()) // Output: Square Perimeter: 20.0

        val triangle = new EquilateralTriangle(4.0)
        println("Triangle Area: " + triangle.area()) // Output: Triangle Area: 6.928203230275509
        println("Triangle Perimeter: " + triangle.perimeter()) // Output: Triangle Perimeter: 12.0
    }
}