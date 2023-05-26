/*11. Java GUI application using swing to change background of jframe using jbutton*/
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MySwing extends JFrame implements ActionListener
{
JButton b1,b2,b3;
MySwing()
{
b1=new JButton("RED");
b2=new JButton("GREEN");
b3=new JButton("BLUE");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setLayout(new FlowLayout());
setVisible(true);
setTitle("My Application");
setSize(300,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}//method close
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
getContentPane().setBackground(Color.RED);
}//if close
else
if(ae.getSource()==b2)
{
getContentPane().setBackground(Color.GREEN);
}//if close
else
if(ae.getSource()==b3)
{
getContentPane().setBackground(Color.BLUE);
}//if close
}//ae close
public static void main(String []args)
{
new MySwing();
}//main close
}//class close