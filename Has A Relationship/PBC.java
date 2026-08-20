public class PBC
{
public static void main(String args[])
{
Product p=new Product();
p.pid=11;
p.pname="Shoe";

Brand b=new Brand();
b.bid=22;
b. bname="Adi123";
b.product=p;

Company c=new Company();
c.cid=33;
c.cname="ADIDAS";
c.brand=b;

System.out.println(p.pid);
System.out.println(p.pname);

System.out.println(b.bid);
System.out.println(b.bname);
System.out.println(p);

System.out.println(c.cid);
System.out.println(c.cname);
System.out.println(b);

}
}