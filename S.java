public class S
{
int x;
String y;
float sal;
public S(int x,  String y)
{
this.x= x;
this.y= y;
}
public static void main(String args[])
{
S s= new S(101, "Ashish");
System.out.println("Roll no : "+(s.x));
System.out.println("Name is :"+(s.y));

s.sal=55000f;
System.out.println("Salary:"+(s.sal));
}
}