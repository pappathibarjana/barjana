import java.util.*;
import java.io.*;
class ex3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sorted a1=new sorted();
System.out.println(a1.fun(n));
}
}
class sorted
{
int fun(int n)
{
int v=0;
int a[]=new int[n];
int i=0;
while(i<n)
{
a[i]=sc.nextInt();
i++;
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(a[i]==i)
{
v=a[i];
break;
}
}
return v;
}
}