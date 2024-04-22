abstract class Shape {
  // Abstract method
  def area(): Double
}

class Circle(radius: Double) extends Shape {
  override def area(): Double = math.Pi * radius * radius
}

class Rectangle(width: Double, height: Double) extends Shape {
  override def area(): Double = width * height
}

object AbstractExample {
  def main(args: Array[String]): Unit = {
    // Create instances of Circle and Rectangle
    val circle = new Circle(5.0)
    val rectangle = new Rectangle(4.0, 3.0)

    // Calculate and print areas
    println(s"Area of circle: ${circle.area()}")
    println(s"Area of rectangle: ${rectangle.area()}")
  }
}
