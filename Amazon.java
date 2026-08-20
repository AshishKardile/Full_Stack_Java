public class Amazon
{
int id;
String name;
String itemname;
float price;

public Amazon(int id, String name, String itemname, float price)
{
//initailize value with this keyword 
this.id= id;
this.name= name;
this.itemname= itemname;
this.price= price;
}

public Amazon(int i, String nm, String inm)
{
//Without using this keyword
id= i;
name= nm;
itemname=inm;
}

public Amazon()
{
int id1=333;
System.out.println("Id : "+(id1));
String itemname1="Fried Rice";
System.out.println("Item Name : "+(itemname1));

}

public static void main(String args[])
{
System.out.println("************FOOD ORDER DETAIL FOR-1**********");

Amazon a=new Amazon(111, "Ashish Kardile", "Chicken Lolipop-Full", 200f );
System.out.println("Id : "+(a.id));
System.out.println("Customer Name : "+(a.name));
System.out.println("Item Name : "+(a.itemname));
System.out.println("Price of item: "+(a.price));

System.out.println("************FOOD ORDER DETAIL FOR-2**********");
Amazon a1= new Amazon(221, "Ronaldo", "Chicken Biryani" );
System.out.println("Id : "+(a1.id));
System.out.println("Customer Name : "+(a1.name));
System.out.println("Item Name : "+(a1.itemname));

System.out.println("************FOOD ORDER DETAIL FOR-3**********");
Amazon a2= new Amazon( );
}
}