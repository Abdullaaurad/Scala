object run{
    def run(x:Int, y:Int):Int={
        return x*y;
    }
    def TotalTime(D1:Int, D2:Int, D3:Int):Int={
        return (run(D1,8) + run(D2,7) + run(D3,8));
    }
    def main(args: Array[String]): Unit = {
        print("Enter easy pase distance =");
        val e = scala.io.StdIn.readInt();
        print("Enter Temp pase distnace =");
        val t = scala.io.StdIn.readInt();
        print("Enter remaining =");
        val r = scala.io.StdIn.readInt();

        val T = TotalTime(e,t,r);
        println("Total time  taken ="+T);
    }
}