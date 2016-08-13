import java.util.*;
class reverse1
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer sb=new StringBuffer(s);
System.out.println(sb.reverse().toString());
}
catch(Exception e)
{
System.out,println(e);
}
}
}