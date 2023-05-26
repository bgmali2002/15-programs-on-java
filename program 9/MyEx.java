/*9. Java Program on Exception Handling*/
import java.lang.*;
class MyEx
{
public static void main(String []args)
{
 try
{
 int a=Integer.parseInt(args[0]);
 int b=Integer.parseInt(args[1]);
 int c=a/b;
 System.out.println("Division is : "+c);
}//try close
 catch(Throwable t)
{
 System.out.println(t);
}//catch close
}//main close
}//class close