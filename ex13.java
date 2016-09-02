import java.util.*;
class ex13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter length of string");
int n=sc.nextInt();
List<Character> l=new LinkedList<Character>();
for(int i=0;i<n;i++)
l.add(sc.next().charAt(0));
StringBuffer sb=new StringBuffer();
for(char c:l)
sb.append(c);
if(sb.toString().equals(sb.reverse().toString()))
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}