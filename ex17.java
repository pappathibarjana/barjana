import java.util.*;
class ex17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int v=n,x=0;
while(n!=0)
{
x=n%10;
v=v*x;
n=n/10;
}
System.out.println(v);
}
}