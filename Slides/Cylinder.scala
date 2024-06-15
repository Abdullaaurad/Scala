object Cylinder{
    def CArea(R:Double, H:Double):Double = {
        return ((Math.PI*R*R)+(Math.PI*2*H));
    }
    def main(args:Array[String]):Unit= {
        print ("Enter the radius of the cylinder =");
        val R = scala.io.StdIn.readDouble();
        print ("Enter the height of the cylinder =");
        val H = scala.io.StdIn.readDouble();

        val Area = CArea(R,H);
        println("Area of the cylinder ="+Area);
    }
}