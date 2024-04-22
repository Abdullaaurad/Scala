package Files

class Circle(radius: Double) extends Shape {
  override def area(): Double = math.Pi * radius * radius
}