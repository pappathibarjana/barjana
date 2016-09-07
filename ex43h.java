import java.util.*;
class ex43h
{
public static void main(String args[])
{
int i=0,j=0,k=0;
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(i=0;i<s.length();i++)
{
if(Character.isLetter(s.charAt(i)))
{
for(j=i+1;j<s.length();j++)
{
if(Character.isLetter(s.charAt(j)))
{
break;
}
}
if(Integer.parseInt(s.substring(i+1,j))>=1 && Integer.parseInt(s.substring(i+1,j))<=99)
{
for(k=0;k<Integer.parseInt(s.substring(i+1,j));k++)
System.out.print(s.charAt(i));
}
}
i=j-1;
}

}
}