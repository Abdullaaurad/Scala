error id: file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/Scala/Loops%20and%20if/leapyer.scala:[9..12) in Input.VirtualFile("file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/Scala/Loops%20and%20if/leapyer.scala", "object 
def isLeapYear(year: Int): String = {
  year match {
    case y if y % 4 == 0 && y % 100 != 0 => "Leap Year"
    case y if y % 400 == 0 => "Leap Year"
    case _ => "Common Year"
  }
}

// Test cases
println(isLeapYear(2020))  // Output: Leap Year
println(isLeapYear(1900))  // Output: Common Year
println(isLeapYear(2000))  // Output: Leap Year
println(isLeapYear(2021))  // Output: Common Year
")
file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/Scala/Loops%20and%20if/leapyer.scala
file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/Scala/Loops%20and%20if/leapyer.scala:2: error: expected identifier; obtained def
def isLeapYear(year: Int): String = {
^
#### Short summary: 

expected identifier; obtained def