class Papaya
{
int id;
long contact;
String name;
long watermelon(long contact)
{
this.contact=contact;
return this.contact;
}
String orange(String name)
{
this.name=name;
return this.name;
}
int kiwi(int id)
{
this.id=id;
return this.id;
}
}
class Emp1
{
public static void main(String z[])
{
Papaya p=new Papaya();
long contact=p.watermelon(123456789);
int id=p.kiwi(61);
String name=p.orange("visista");
System.out.print(id+""+name+""+contact);
}
}