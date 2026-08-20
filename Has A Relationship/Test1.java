public class Test1
{
public static void main(String args[])
{
Dept D = new Dept(102,"Hr");

Emp E =new Emp(101,"Ashish",D);

System.out.println(E.eid);
System.out.println(E.ename);
System.out.println(E.dep);

System.out.println(D.did);
System.out.println(D.dname);


}
}