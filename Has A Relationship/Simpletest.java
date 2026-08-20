public class Simpletest
{
public static void main(String args[])
{
Simplecollege sc=new Simplecollege();
sc.cid=11;
sc.cname="MIT";

Simpleuniversity su=new Simpleuniversity();
su.uid=22;  //comment for t-2
su.uname="MITWPU"; //comment for t-2
su.clg=sc;

//Type-1
//System.out.println(sc.cid);
//System.out.println(sc.cname);
//System.out.println(su.uid);
//System.out.println(su.uname);
//System.out.println(sc);

//Type-2-Getting values through College obj
//Simplecollege sc1=su.clg;
//System.out.println(sc1.cid);
//System.out.println(sc1.cname);

//Type-3-Getting clg values through University
su.clg.cid=22;
su.clg.cname="Dy patil";
System.out.println(su.clg.cid);
System.out.println(su.clg.cname);
}
}