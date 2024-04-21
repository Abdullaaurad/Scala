object StringExample {
  def main(args: Array[String]): Unit = {
    // Define a string
    val str1 = "Hello, Scala!"

    // String concatenation
    val str2 = "Welcome to " + "Scala programming."
    println(str2)

    // String interpolation
    val name = "Alice"
    val age = 30
    val message = s"My name is $name and I am $age years old."
    println(message)

    // Multiline string using triple quotes
    val multilineStr =
      """
        |This is a multiline string.
        |It can span multiple lines.
        |Scala is a powerful language.
      """.stripMargin
    println(multilineStr)

    // String length
    println(s"Length of '$str1' is ${str1.length}")

    // Accessing characters by index
    val firstChar = str1(0)
    println(s"First character of '$str1' is $firstChar")

    // Substring
    val substr = str1.substring(0, 5)
    println(s"Substring of '$str1' from index 0 to 4 is '$substr'")

    // Splitting string into an array
    val words = str1.split(", ")
    println(s"Splitting '$str1' into words: ${words.mkString(", ")}")

    // Checking if a string contains a substring
    val containsScala = str1.contains("Scala")
    println(s"Does '$str1' contain 'Scala'? $containsScala")

    // Converting to uppercase and lowercase
    val upper = str1.toUpperCase
    val lower = str1.toLowerCase
    println(s"Uppercase: $upper, Lowercase: $lower")

    // Replace substring
    val replacedStr = str1.replace("Scala", "Java")
    println(s"Replacing 'Scala' with 'Java': $replacedStr")

    // Removing leading and trailing whitespace
    val strWithWhitespace = "  Scala is awesome!    "
    val trimmedStr = strWithWhitespace.trim
    println(s"Original string: '$strWithWhitespace', Trimmed string: '$trimmedStr'")
  }
}
