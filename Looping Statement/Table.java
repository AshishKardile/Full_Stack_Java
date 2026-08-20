import java.util.Scanner;
public class Table
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();


System.out.println("***********LOGIC-1:i=1; i<=10 ;i++  SOP(num * i )**************");
for(int i=1; i<=10 ;i++)
{
System.out.println( num * i );
}


System.out.println("***********LOGIC-2:i=num; i<=num*10 ; i=i+num  SOP(i)**************");
for(int i=num; i<=num*10 ; i=i+num)
{
System.out.println( i );
}

}
}
