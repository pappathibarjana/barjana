import java.util.*;
class unique
{
public static void main(String args[])
{
Set<Character> set=new LinkedHashSet<Character>();
StringBuffer sb=new StringBuffer();
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i++)
{
set.add(s.charAt(i));
}
for(char c:set)
sb.append(c);
System.out.println(sb.toString());
}
}