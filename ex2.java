import java.util.*;
class ex2
{
public static void main(String args[])
{
int i=0;
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer();
int n=sc.nextInt();
int k=sc.nextInt();
List<Integer> l=new LinkedList<Integer>();
while(n!=0)
{
l.add(n%10);
n=n/10;
}
Collections.sort(l);
for(i=l.size()-k;i<l.size();i++)
{
l.remove(i);
i--;
}
for(i=0;i<l.size();i++)
{
sb.append(l.get(i));
}
int v=Integer.parseInt(sb.toString());
System.out.println(v);
}
}

