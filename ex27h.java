import java.util.*;
class ex27h
{
public static void main(String args[])
{
int i=0,j=0,max=0;
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(i=0;i<s.length();i++)
{
for(j=i+1;j<=s.length();j++)
{
StringBuffer sb=new StringBuffer(s.substring(i,j));
if(!(sb.toString().equals(sb.reverse().toString())))
{
if(sb.length()>max)
max=sb.length();
}
}
}
System.out.println(max);
}
}