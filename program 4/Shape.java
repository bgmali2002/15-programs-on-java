/*4. Java Program on Method Overloading*/
import java.lang.*;
class Shape
{
void area(int s)
{
System.out.println("Area of Square is: "+s*s);
}
void area(int l,int b)
{
System.out.println("Area of Rectangle is: "+l*b);
}
void area(double r)
{
System.out.println("Area of Circle is: "+3.141592653589793238*r*r);
}
public static void main(String []args)
{
 Shape obj=new Shape();
 obj.area(4);
 obj.area(3,5);
 obj.area(3.2);
}//main close
}//class close