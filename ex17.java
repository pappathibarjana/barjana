import java.util.*;
class ex17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=n,i=0;
int x=0,v=0,k=0;
for(i=1;i<=n;i++)
{
v=i;
k=i;
while(k!=0)
{
x=k%10;
v=v*x;
k=k/10;
}
if(v==n1)
System.out.println(i);
}
}
}