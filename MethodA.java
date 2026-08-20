public class MethodA
{
//Simple Method
public void add()
{
int n1=10;
int n2=50;
System.out.println("Addition : "+(n1 + n2));
}
//Parameterized Method
public void sub(int n1, int n2)
{
int res1=n1 - n2;
System.out.println("Subtraction with parameter:"+(res1));
}

//Parameterized Method
public void nm(String name)
{
System.out.println("Name with paraneter:" + (name));

}

//Return-Type Method
public int mul()
{
return (10 * 20);
}
//Return-Type Method
public int add1()
{
int a=100;
int b=200;
int res2=a+b;
return res2;
}
// Return-Type Method with Parameterized Method
public int mul1(int a, int b)
{
int res3=a * b;
return res3;
}

}