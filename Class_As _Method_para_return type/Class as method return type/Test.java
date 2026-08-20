public class Test
{
public static void main(String args[])
{
AddEmoployee a = new AddEmoployee();
Employee E= a.setEmpData();
System.out.println("Employee id is:"+(E.eid));
System.out.println("Employee name is:"+(E.ename));
}
}