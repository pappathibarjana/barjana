import java.util.*;
class ex48
{
public static void main(String args[])
{
int flag=-1;
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
for(int i=0;i<s1.length();i++)
{
for(int j=i+1;j<=s1.length();j++)
{
if(s1.substring(i,j).equals(s2))
flag=s1.indexOf(s2);
}
}
System.out.println(flag);
}
}