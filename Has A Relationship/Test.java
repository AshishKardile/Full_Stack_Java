public class Test
{
public static void main(String args[])
{
Employee E=new Employee();
E.setEId(111);
E.setEName("Ashish");
 
Department D=new Department();
D.setId(222);
D.setName("Manager");

E.setDepartment(D);

int eid=E.getEId();
System.out.println("Employee Id:"+(eid));
String ename=E.getEName();
System.out.println("Employee Name:"+(ename));

E.getDepartment();
int did=D.getId();
System.out.println("Department Id:"+(did));
String dname=D.getName();
System.out.println("Department Name:"+(dname));


}
}