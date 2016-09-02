import java.util.*;
class ex6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt;
int a[]=new int[n];
for(int j=0;j<n;j++)
a[j]=sc.nextInt();
for(int i=0;i<a.length-1;i++)
{
if(a[i]==a[i+1])
{
System.out.println(a[i]);
break;
}
}
}
}
