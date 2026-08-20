public class GetSetTest
{
public static void main (String args[])
{
GetSetStudent1  s = new GetSetStudent1();
System.out.println("***********GETTER SETTER METHOD************");

s.setRollno(10);
int roll=s.getRollno();
System.out.println("Roll:"+(roll));

s.setName("Ashish");
String name=s.getName();
System.out.println("Name:"+(name));


s.setMarks(78.90f);
float marks=s.getMarks();
System.out.println("Marks:"+(marks));

}
}