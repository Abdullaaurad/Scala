object convert{
    def ToFahrenheit(c:Double):Double ={
        return ((c*1.8000)+32.00)
    }
    def main(args: Array[String]):Unit ={
        println ("35 Celsius in Fahrenheit ="+ToFahrenheit(35.0))
    }
}