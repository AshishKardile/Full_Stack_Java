public class Variable
{
int num1=10;
public void add()
{
int num1=20;
int num2=30;
System.out.println("NUM1 :"+num1);
num1=40;
System.out.println("NUM1 :"+num1);
System.out.println("Global NUM1 :"+(this.num1));

System.out.println("Addition :"+(num1 + num2));
}
public void m1()
{
System.out.println("NUM1 :"+num1);
}
public static void main(String args[])
{
Variable v=new Variable();
v.add();
v.m1();
}
}