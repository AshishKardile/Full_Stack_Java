public class MethodB
{
public static void main(String args[])
{
MethodA a= new MethodA();
a.add();
a.sub(200, 60);
a.nm("Ashish");

a.mul();
System.out.println("Multiplication of return type:"+(a.mul()));

int res= a.add1();
System.out.println("Addition  of return type:"+(res));

int res1=a.mul1(50,60);
System.out.println("Multiplication of return type with parameter:"+(res1));



}
}