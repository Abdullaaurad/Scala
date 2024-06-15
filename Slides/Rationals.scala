object RationalDemo {
  def main(args: Array[String]): Unit = {
    val r1 = new Rational(1, 2)
    val r2 = new Rational(1, 3)

    val result = r1 + r2
    println(s"${r1} + ${r2} = $result")
  }
}

class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be non-zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(n, d)

  val numer: Int = n / g
  val denom: Int = d / g

  // Overload the + operator
  def +(r: Rational): Rational = {
    new Rational(
      this.numer * r.denom + r.numer * this.denom,
      this.denom * r.denom
    )
  }

  override def toString: String = s"$numer/$denom"
}
