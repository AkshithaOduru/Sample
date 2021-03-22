class Student
{
int id;
lang phn;
String name;
Student(int i,lang p,String n)
{
id=i;
name=n;
phn=p;
}
void stdpro()
{
System.out.println("stdpro"+id+phn+name);
}
}
class Dept
{
int code;
String dname;
int faculty;
Dept(int c,String d,int f);
{
code=c;
dname=d;
faculty=f;
}
}
void deptpro()
{
System.out.println("deptpro"+code+dname+faculty);
}
}
class M
{
public static void main(String args[])
{
Student s=new Student(123,1234567890,"g");
s.stdpro();
Dept d=new Dept(61,"cse",5);
d.deptpro();
}
}