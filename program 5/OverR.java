/*5. Java program on Method Overridding*/
import java.lang.*;
class Bank
{
float getROI()
{
return 0.0f;
}
}//bank class close
class SBI extends Bank
{
float getROI()
{
return 7.9f;
}
}//SBI class close
class PNB extends Bank
{
float getROI()
{
return 8.2f;
}
}//PNB class close
class OverR
{
public static void main(String[] args)
{
 Bank B=new Bank();
 System.out.println("Bank Interest rate is: "+B.getROI()+"%");
 SBI S=new SBI();
 System.out.println("SBI Interest rate is: "+S.getROI()+"%");
 PNB P=new PNB();
 System.out.println("PNB Interest rate is: "+P.getROI()+"%");
}//main close
}//class close