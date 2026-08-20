import java.util.Scanner;
public class Test
{
 public static void main(String args[])
{
Basic b = new Basic();
Scanner sc = new Scanner(System.in);

System.out.print("Enter Rollno:");
int rl = sc.nextInt();
b.rollno = rl;

System.out.print("Enter Name:");
String nm = sc.next();
b.name = nm;

System.out.print("Enter Marks:");
float mk = sc.nextFloat();
b.marks = mk;

System.out.print("Enter Salary:");
double sal = sc.nextDouble();
b.salary = sal;

System.out.print("Enter Mobileno:");
long mn = sc.nextLong();
b.mobileno = mn;

System.out.println("****************DETAILS**************");
System.out.println(b.rollno);
System.out.println(b.name);
System.out.println(b.marks);
System.out.println(b.salary);
System.out.println(b.mobileno);
}
}