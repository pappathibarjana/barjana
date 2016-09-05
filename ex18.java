import java.util.*;
class ex18
{
public static void main(String args[])
{
int i=0,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter N value:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter values for N:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter sum");
int s=sc.nextInt();
Arrays.sort(a);
for(i=n-1;i>=0;i--)
{
while(s>=a[i])
{
s=s-a[i];
c++;
}
if(s==0)
break;
}
System.out.println("minimum no of coins required:"+c);
}
}
