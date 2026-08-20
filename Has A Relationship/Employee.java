public class Employee
{
private int eid;
private String ename;
private Department dept;

public void setEId(int eid)
{
this.eid=eid;
}
public int getEId()
{
return eid;
}

public void setEName(String ename)
{
this.ename=ename;
}
public String getEName()
{
return ename;
}

public void setDepartment(Department dept)
{
this.dept=dept;
}
public Department getDepartment()
{
return dept;
}

}