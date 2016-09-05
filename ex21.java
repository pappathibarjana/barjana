import java.util.*;
class ex21
{
public static void main(String args[])
{
int t=1,flag=-1,s1=0,s2=0,a1=0,a2=0,i=0,j=0,k=0,v=0;
Scanner sc=new Scanner(System.in);
List<Integer> l1=new LinkedList<Integer>();
List<Integer> l2=new LinkedList<Integer>();
System.out.println("enter size");
int n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(v=0;v<n-1;v++)
{
for(j=v;j>=0;j--)
{
l1.add(a[j]);
s1+=a[j];
}
for(k=v+1;k<n;k++)
{
l2.add(a[k]);
s2+=a[k];
}
a1=s1/l1.size();
a2=s2/l2.size();
if(a1==a2)
{
Collections.reverse(l1);
System.out.println("possible:"+t);
System.out.println(l1+","+l2);
flag=1;
t++;
}
l1.clear();
l2.clear();
s1=0;
s2=0;
a1=0;
a2=0;
}
if(flag==-1)
System.out.println("Not Possible");
}
}
