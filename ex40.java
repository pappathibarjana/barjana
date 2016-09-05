import java.util.*;
class ex40
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0;
if(n==0)
System.out.println("palindrome");
else
{
while(n!=0)
{
s+=n%10;
n=n/10;
}
StringBuffer sb=new StringBuffer();
sb.append(s);
if(sb.charAt(0)=='0')
{
System.out.println("not a palindrome");
}
else
{
if(sb.toString().equals(sb.reverse().toString()))
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}
}
}
