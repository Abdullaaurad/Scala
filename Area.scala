object AreaCalculate{
    def Area(r:Double):Double={
        return (Math.PI*r*r)
    }
    def main(args: Array[String]):Unit ={
        println ("Area of disk with radius of 5 ="+Area(5))
    }
}