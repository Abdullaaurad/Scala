object wage{
    def Wage(x:Int ):Int ={
        return x*150;
    }

    def overtimeSalary(x:Int) :Int = {
        return x*75;
    }

    def TotalSalary(w:Int, o:Int):Int = {
        return w+o;
    }

    def TakeHomeSalary(x:Int):Double ={
        return x*0.9;
    }

    def main(args: Array[String]): Unit ={
        print("enter the wage hour =");
        var wageTime = scala.io.StdIn.readInt();

        print("enter the overtime hour =");
        var overtime = scala.io.StdIn.readInt();

        var Total = TotalSalary(Wage(wageTime),overtimeSalary(overtime));
        print ("The total wage ="+Total);

        var Home = TakeHomeSalary(Total)
        print (s"\nTake home salary ="+Home);
    }
}
