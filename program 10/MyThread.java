/*10. Java Program on MultiThreading using Runnable interface*/
import java.lang.*;
class MyThread implements Runnable
{
public void run()
{
for(int i=0;i<=100;i++)
{
System.out.println("Hello");
}//for close
}//method close
public static void main(String []args)
{
MyThread myt=new MyThread();
Thread t=new Thread(myt);
t.start();
for(int i=0;i<=100;i++)
{
System.out.println("World!");
}//for close
}//main close
}//class close