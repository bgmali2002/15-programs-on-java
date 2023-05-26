/*1. Java Program on given number is prime or not using scanner*/
import java.lang.*;
import java.util.*;
class Prime
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
int n=sc.nextInt();
int i;
for(i=2;i<n;i++)
{
if(n%i==0)
break;
}//for close
if(i==n)
System.out.println(n+" is Prime number.");
else
System.out.println(n+" is not Prime number.");
}//main close
}//class close