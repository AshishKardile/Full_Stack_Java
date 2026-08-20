public class Emptest
{
public static void main(String args[])
{
Employee e= new Employee();
System.out.println("############************Employee Info********##############");
e.setId(111);
int id=e.getId();
System.out.println("Employee Id:"+(id));

e.setName("Ashish");
String name=e.getName();
System.out.println("Employee Name:"+(name));

e.setSalary(55000.50f);
float salary=e.getSalary();
System.out.println("Employee Salary:"+(salary));

e.setAddress("Kothrud,Pune");
String add=e.getAddress();
System.out.println("Employee Address:"+(add));

}
}