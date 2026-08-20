
public class EO
{
public static void main(String args[])
{
System.out.println("***************EVEN NUMBER****************");

for(int i=1; i<=100; i++)
{
if(i % 2==0)
{
System.out.println("Number is even:"+(i));
}
}
System.out.println("***************ODD NUMBER****************");
for(int j=1; j<=100; j++)
{
if(j % 2==1)
{
System.out.println("Number is odd:"+(j));
}
}
System.out.println("********************************TOGETHER EVEN_ODD NUMBER*********************************");

for(int k=1; k<=100; k++)
{
if(k % 2==0)
{
System.out.println("Number is even:"+(k));
}
else
{
System.out.println("Number is odd:"+(k));
}
}
}
}