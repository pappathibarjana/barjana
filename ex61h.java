import java.util.*;
import java.lang.*;
class ex61h
{
public static void main(String args[])
{
int e=0,s=0,c=0,j=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
int arr[]=new int[n];
List<Integer> li=new ArrayList<Integer>();
System.out.println("enter elements");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter two elements in the array ");
s=sc.nextInt();
e=sc.nextInt();
for(i=0;i<n;i++)
{
if(s==arr[i])
{
c++;
for(j=i+1;j<n;j++)
{
if(arr[j]!=e)
{
c++;
}
else
{
break;
}
}
li.add(c);
c=0;
}
}
for(i=n-1;i>=0;i--)
{
if(s==arr[i])
{
c++;
for(j=i-1;j>=0;j--)
{
if(arr[j]!=e)
{
c++;
}
else
{
break;
}
}
li.add(c);
c=0;
}
}
Collections.sort(li);
System.out.println("minimum path is:"+li.get(0));
}
}