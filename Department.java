public class Department
{
int id=111;
String name="Computer";
int Fno=50;

public void displayDetail()
{
int id=777;
String name="AIDS";
int Fno=35;

System.out.println(id);
System.out.println(name);
System.out.println(Fno);
}

public static void main(String args[])
{
System.out.println("***********Local Deparment Info***********");
Department  d = new Department();
d.displayDetail();
System.out.println("**********Global Dept Info*********");
System.out.println("ID: "+d.id);
System.out.println("Dept Name: "+d.name);
System.out.println("Faculty Member: "+d.Fno);
}
 }