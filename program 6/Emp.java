/*6. Java progam on Default & Parameterized constructor*/
import java.lang.*;
class Emp
{
int eno;
String ename;
Emp()//Default Constructor
{
eno=0;
ename="null";
}
Emp(int a,String s)//Parameterized Constructor
{
eno=a;
ename=s;
}
void show()
{
System.out.println(eno+"	"+ename);
}
public static void main(String []args)
{
 Emp obj1=new Emp();
 Emp obj2=new Emp(301,"Anurag");
 Emp obj3=new Emp(302,"Bhavesh");
 obj1.show();
 obj2.show();
 obj3.show();
}//main close
}//class close