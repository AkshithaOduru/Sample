class Nestedif
{
public static void main(String args[])
{
byte a=10,b=20,c=30;
if(a>b && a>c)
{
System.out.println(a);
}
if(b>a && b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}