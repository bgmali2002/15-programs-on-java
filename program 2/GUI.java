/*2.Java Program on add two numbers using Graphical User Interface(GUI)*/
import java.lang.*;
import javax.swing.*;
class GUI
{
public static void main(String []args)
{
String s1,s2;
s1=JOptionPane.showInputDialog("Enter a value");
s2=JOptionPane.showInputDialog("Enter b value");
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a+b;
JOptionPane.showMessageDialog(null,"Sum of a and b is: "+c);
}//main close
}//class close