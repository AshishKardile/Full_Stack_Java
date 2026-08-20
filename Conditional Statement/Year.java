import java.util.Scanner;
public class Year
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Year:");
int year=s.nextInt();

if(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)
{
System.out.println(year+"year is leap");
}
else
{
System.out.println(year+"year is not leap");
}
}
}