object leap{
    def isLeapYear(year: Int): String = {
        year match {
            case y if y % 4 == 0 && y % 100 != 0 => "Leap Year"    //year is asigned to y 
            case y if y % 400 == 0 => "Leap Year"
            case _ => "Common Year"        
        }
    }

    def leapYear(year:Int):Boolean= {
        (year%4==0 && year%100!=0) || year%400==0 match{
        case true => true
        case false => false
        }
    }

    def main(args: Array[String]):Unit ={
        println(isLeapYear(2020))  // Output: Leap Year
        println(isLeapYear(1900))  // Output: Common Year
        println(isLeapYear(2000))  // Output: Leap Year
        println(isLeapYear(2021))  // Output: Common Year

        println(leapYear(2020))  // Output: Leap Year
        println(leapYear(1900))  // Output: Common Year
        println(leapYear(2000))  // Output: Leap Year
        println(leapYear(2021))  // Output: Common Year
    }
}