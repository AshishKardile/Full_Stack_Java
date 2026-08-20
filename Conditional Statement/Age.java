import java.util.Scanner;
public class Age
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Age");
int age=sc.nextInt();

if(age>=18)
{
System.out.println(age+"age is eligible for voting");
}
else{
System.out.println(age+"age is not eligible for voting");
}
}
}