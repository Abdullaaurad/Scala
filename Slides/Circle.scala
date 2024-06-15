object circle{
    def TArea(R1:Double, R2:Double):Double = {
        if(R1>R2){
            return ((Math.PI*R1*R1) -(Math.PI*R2*R2));
        }
        else{
            return ((Math.PI*R2*R2) -(Math.PI*R1*R1));
        }
    }
    def main(args:Array[String]):Unit= {
        print ("Enter the radius of the circle1 =");
        val R1 = scala.io.StdIn.readDouble();
        print ("Enter the radius of the circle2 =");
        val R2 = scala.io.StdIn.readDouble();

        val Area = TArea(R1,R2);
        println("Area of the ring ="+Area);
    }
}