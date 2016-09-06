import java.util.*;
class ex4h
{
public static void main(String args[])
{
int i=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
ex4h e=new ex4h();
e.findUnique(a);
}
void findUnique(int a[])
{
if(a.length%2!=0)
{
Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
int i=0;
for(i=0;i<a.length;i++)
{
m.put(a[i],m.containsKey(a[i])?m.get(a[i])+1:1);
}
Set<Integer> s=m.keySet();
for(int j:s)
{
if(m.get(j)==1)
{
System.out.println(j);
break;
}
}
}
}
}
