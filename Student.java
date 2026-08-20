public class Student
{
byte img=70;
short age=20;
int rollno=600;
double pocmoney=5555.555d;
float marks=89.75f;
char gender='M';
boolean isMarried= false ;
long mobno=8180968975L;

String name="Ashish Sunil Kardile";

//Default Value

byte img1;
short age1;
int rollno1;
double pocmoney1;
float marks1;
char gender1;
boolean isMarried1;
long mobno1;

String nm;



public static void main(String args[])
{

Student s = new Student();
System.out.println("****************Default Values**************");
System.out.println("**************STUDENT INFO*************");
System.out.println(s.img1);
System.out.println(s.age1);
System.out.println(s.rollno1);
System.out.println(s.pocmoney1);
System.out.println(s.marks1);
System.out.println(s.gender1);
System.out.println(s.isMarried1);
System.out.println(s.mobno1);
System.out.println(s.nm);
System.out.println("\n");

System.out.println("**************STUDENT INFO*************");
System.out.println("Image of Student"+s.img);
System.out.println("Age: "+s.age);
System.out.println("RollNo: "+s.rollno);
System.out.println("PocketMoney: "+s.pocmoney);
System.out.println("Marks: "+s.marks);
System.out.println("Gender: "+s.gender);
System.out.println("Married or Not: "+s.isMarried);
System.out.println("Moblile No: "+s.mobno);
System.out.println("Name: "+s.name);

}
}