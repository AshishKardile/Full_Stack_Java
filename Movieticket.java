public class Movieticket
{
String name;
String gener;
float price;
int seatno;
char row;
public void displayinfo()
{
System.out.println("Name:"+name);
System.out.println("Gener: "+gener);
System.out.println("Amount: "+price);
System.out.println("SeatNo: "+seatno);
System.out.println("Row: "+row);

}
public static void main (String args[])
{
Movieticket m=new Movieticket();
System.out.println("**************MovieTicket Info************");
m.name="Dhurandhar";
m.gener="18+";
m.price=500f;
m.seatno=7;
m.row='F';
m.displayinfo();
}
}