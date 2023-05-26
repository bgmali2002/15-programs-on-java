/*12. Java Program on String Handling*/
import java.lang.*;
class MyStr
{
public static void main(String []args)
{
String s1,s2,s3;
s1="hello";
s2="world";
//Check Length of String?
System.out.println("Length of s1 is: "+s1.length());
//Check Character Position in String?
System.out.println("Character at 2 position in s2 is: "+s2.charAt(1));
//Concatination of two String 
s3=s1.concat(s2);
System.out.println("Concatnation of s1 and s2 is: "+s3);
//Check two String are equal ?
System.out.println("Both are equals?: "+s1.equals(s2));
s2="hello";
System.out.println("Both are equals?: "+s1.equals(s2));
s2="HELLO";
//Check two String are equal using Ignore cases?
System.out.println("Ignoring cases: "+s1.equalsIgnoreCase(s2));
//Change String in lower case
s1="JAVA";
s1=s1.toLowerCase();
System.out.println(s1);
//Change String in upper case
s2="world";
System.out.println(s2.toUpperCase());
//create sub-string of string!
s3="oracle";
System.out.println(s3.substring(1,4));
}//main close
}//class close