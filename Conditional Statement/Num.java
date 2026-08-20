import java.util.Scanner;
public class Num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Num:");
int num=sc.nextInt();

if(num %2==0)
{
System.out.println(num+"number is even");
}
else{
System.out.println(num+"number is odd");
}
}
}