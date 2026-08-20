public class Test
{
public void getStudent(Student Stud)
{
Stud.getRoll();
float marks=Stud.marks;
System.out.println("Mark obtain:"+marks);
}
public static void main(String args[])
{
Test t=new Test();
Student s= new Student();
t.getStudent(s);
}
}