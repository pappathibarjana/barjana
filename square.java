import java.util.*;
class square
{
public static void main(String args[])
{
//StringBuffer sb=new StringBuffer("no square");
int i=0,m=0,n=0,j=0;
Scanner sc=new Scanner(System.in);
List<Integer> l=new ArrayList<Integer>();
List<Integer> l1=new ArrayList<Integer>();
int x[]=new int[4];
int y[]=new int[4];
for(i=0;i<4;i++)
{
System.out.println("enter point "+i);
x[i]=sc.nextInt();
y[i]=sc.nextInt();
}
for(i=0;i<3;i++)
{
for(j=i+1;j<=3;j++)
{
if(x[i]==x[i+1] && y[i]==y[i+1])
{
System.out.println("not a square");
System.exit(0);
}
}
}
m=x[0];
for(i=1;i<4;i++)
{

if(x[0]!=x[i])
{
l.add(x[i]);
}
}
if(l.size()==2)
{
if(l.get(0)==l.get(1))
{
n=(int)l.get(0);
}
}
int xaxis=(int)Math.abs(m-n);
System.out.println(xaxis);
 m=y[0];
for(i=1;i<4;i++)
{
if(y[0]!=y[i])
{
l1.add(y[i]);
}
}
if(l1.size()==2)
{
if(l1.get(0)==l1.get(1))
{
n=(int)l1.get(0);
}
}
int yaxis=(int)Math.abs(m-n);
if(xaxis==yaxis)
{
System.out.println("square");
}
}
}




