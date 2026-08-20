import java.util.Scanner;
public class Caltest
{
 public static void main(String args[])
{
Calculator c=new Calculator();
Scanner sc = new Scanner(System.in);

System.out.print("Enter Number1:");
int num1 = sc.nextInt();

System.out.print("Enter Number2:");
int num2 = sc.nextInt();

int resadd = c.addition(num1,num2);
System.out.println(resadd);

int ressub = c.subtraction(num1,num2);
System.out.println(ressub);

int resmul = c.multiplication(num1,num2);
System.out.println(resmul);

int resdiv =c.division(num1,num2);
System.out.println(resdiv);
}
}



