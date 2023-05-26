/*7.Java program on multiple inheritance using Interfaces*/
import java.lang.*;
interface Eat
{
public void eat();
}
interface Run
{
public void run();
}
class Animal implements Eat,Run
{
 public void eat()
 {
  System.out.println("Animal is eating");
 }
 public void run()
 {
  System.out.println("Animal is running");
 }
public static void main(String[] args)
{
 Animal obj=new Animal();
 obj.eat();
 obj.run();
}//main close
}//class close