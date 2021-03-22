class Rectangle
{
void rect(int l,int b)
{
System.out.println(l*b);
}
void rect(float l,float b)
{
System.out.println(l*b);
}
}
class Rec1
{
public static void main(String a[])
{
Rectangle r=new Rectangle(); 
Rectangle r1=new Rectangle();
r.rect(1,2);
r1.rect(1.1f,2.2f);
}
}