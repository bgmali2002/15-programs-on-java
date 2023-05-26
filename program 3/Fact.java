/*3.Java program on find factorial using command line*/
import java.lang.*;
class Fact
{
public static void main(String[] args)
{
if(args.length==1)
{
int n=Integer.parseInt(args[0]);
int f=1;
while(n>1)
{
f=f*n;
n--;
}//while close
System.out.println("Factorial is: "+f);
}//if close
else
System.out.println("Please! Enter one value in command line!");
}//main close
}//class close