public class Brand
{
int id=8180;
String name="Oppo";
String  model="Z15";

public void displayBrand()
{
int id=7777;
String name="Vivo";
String  model="V35";
System.out.println(id);
System.out.println(name);
System.out.println(model);
}

public static void main(String args[])
{
System.out.println("*********** LOCAL PHONE BRAND***********");
Brand c1 = new Brand();
 c1.displayBrand();
System.out.println("GLOBAL  PHONE BRFAND");
System.out.println("ID: "+c1.id);
System.out.println("FuelCapacity: "+c1.name);
System.out.println("Model: "+c1.model);
}
 }