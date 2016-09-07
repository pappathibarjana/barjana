import java.util.*;
class ex10h
{
public static void main(String args[])
{
int i=0,flag=1;;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a1[]=new int[n];
for(i=0;i<n;i++)
{
a1[i]=sc.nextInt();
}
int m=sc.nextInt();
int a2[]=new int[m];
for(i=0;i<m;i++)
{
a2[i]=sc.nextInt();
}
if(a1.length<=a2.length)
{
List<Integer> l=new LinkedList<Integer>();
for(int i2:a2)
{
l.add(i2);
}
for(int i1:a1)
{
if(l.contains(i1))
{
l.remove(l.indexOf(i1));
}
else
{
flag=-1;
break;
}
}
if(flag==1)
System.out.println("true");
else
System.out.println("false");
}
else
{
System.out.println("false");
}
}
}
