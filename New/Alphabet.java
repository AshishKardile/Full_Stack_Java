public class Alphabet
{
int id;
String bname;
String Branchname;
int ifscode;

public Alphabet(int id, String bname, String Branchname, int ifscode)
{
//initailize value with this keyword 
this.id= id;
this.bname= bname;
this.Branchname= Branchname;
this.ifscode= ifscode;
}
public static void main(String args[])
{
System.out.println("************BANK DETAIL**********");

Alphabet a=new Alphabet(111, "State Bank Of India", "Shirur", 27898);
System.out.println("Id : "+(a.id));
System.out.println("Bank Name : "+(a.bname));
System.out.println("Branch Name : "+(a.Branchname));
System.out.println("IFSCODE: "+(a.ifscode));

}
}