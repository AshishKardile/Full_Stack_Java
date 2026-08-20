import java.util.Scanner;
public class MenuCal
{
public static void main(String srgs[])
{
Scanner sc=new Scanner(System.in);
Calculator c = new Calculator();

System.out.println("\t\t\t\t\t*****Calculator Menu:*****");
System.out.println("Enter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division ");
int ch=sc.nextInt();

System.out.print("Enter num1:");
int num1=sc.nextInt();

System.out.print("Enter num2:");
int num2=sc.nextInt();

if(ch == 1)
{
int resadd=c.add(num1,num2);
System.out.println("Addition of "+ num1 + " and "+num2+"is:"+(resadd));
}
else if(ch == 2)
{
int ressub=c.sub(num1,num2);
System.out.println("Subtraction of "+ num1 +" and "+ num2+"is:"+(ressub));
}
else if(ch == 3)
{
int resmul=c.mul(num1,num2);
System.out.println("Multiplication of "+ num1 +" and "+ num2+"is:"+(resmul));
}
else if(ch == 4)
{
int resdiv=c.div(num1,num2);
System.out.println("Division of "+ num1 +" and "+num2+"is:"+(resdiv));
}
else
{
System.out.println("Invalid choice"); 
}
}
}