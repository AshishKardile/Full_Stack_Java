public class Product
{
public void detail(String nm, String model){
System.out.println("Name:"+(nm));
System.out.println(" Model:"+(model));
}
public void Configuration( int ram, int rom)
{
System.out.println("Ram" +(ram));
System.out.println(" Rom:"+(rom));
}
public void purchase(double price, String location)
{
System.out.println("Price: " +(price) );
System.out.println(" Location: "+(location));
}
public static void main(String args[])
{
Product p = new Product();
p.detail("Samsung", "A15");
p.Configuration(16, 128);
p.purchase(20000.80, "Kothrud");
}
}