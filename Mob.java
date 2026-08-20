public class Mob
{
public Mob( float price, String com)
{
System.out.println("Company:"+ (com));
System.out.println("Price:"+ (price));
}
 public static void main(String args[])
{
Mob m= new Mob(1000.50f, "Samsung");
Mob m1= new Mob(10000f, "IPhone");
Mob m2= new Mob(20000f, " Vivo");

}
}
