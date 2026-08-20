public class Const
{
public Const()
{
System.out.println("This is Non parameterized Constructor");
}

public Const(int id, String name)
{
System.out.println("This is  parameterized Constructor");
System.out.println("Id:"+(id));
System.out.println("Name:"+(name));
}

public Const( String add, int rno)
{
System.out.println("Roll No:"+ (rno));
System.out.println("Address:"+ (add));
}

public Const( float sal, double no)
{
System.out.println("Salary:"+ (sal));
System.out.println("Mobile No:"+ (no));
}
public static void main(String args[])
{
System.out.println("*******WELL COME TO CONSTRUCTOR******");
Const c1 = new Const();
Const c2 = new Const(101, "Ashish Sunil Kardile");
Const c3 = new Const(60, "Pune");
Const c4 = new Const(70000f, 8180968975d);

} 
}