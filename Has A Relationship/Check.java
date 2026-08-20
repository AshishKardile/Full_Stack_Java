public class Check
{
public Dept getDept()
{
Dept D=new Dept(101,"Hr");
return D;
}

public Emp getEmp()
{
Emp E=new Emp(101,"Hr",D);
return E;
}
}