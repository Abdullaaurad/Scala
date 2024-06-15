object volume{
    def SphereVolume(R:Double):Double ={
        return ((4*Math.PI*R*R*R)/3)
    }
    def main(args: Array[String]):Unit={
        println ("Volume of sphere with radius of 5 ="+SphereVolume(5))
    }
}