class Apple
{
int id;
String name;
long contact;
Apple(int id,String name,long contact)
{
this.id=id;
this.name=name;
this.contact=contact;
}
void details()
{
System.out.print(id+""+name+""+contact);
}
}
class Emp
{
public static void main(String z[])
{
Apple a=new Apple(61,"visista",123456789);
a.details();
}
}