object MatchExample {
  def main(args: Array[String]): Unit = {
    val num = 4

    val result = num match {
      case 1 => "One"
      case 2|3|5|7|11 => "Prime"
      case 4|6|8|9|12 => "Number below 12"
      case _ => "Other"
    }

    println(result) // Output: Three

    val age = 18
    age match{
        case 20 => println(age)
        case 21 => println(age)
        case 22 => println(age)
        case 23 => println(age)
        case _ => println("other")
    }
  }
}