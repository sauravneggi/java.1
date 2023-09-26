import java.util.Scanner;
import java.lang.*;
class Characters
{
  public static void main(String args[])
 {
   String str,newstr="";
   int length,i;
   Scanner scn=new Scanner(System.in);
   System.out.println("enter a string:");
   str=scn.nextLine();
   length=str.length();
   for(i=0;i<length;i++)
   {
     char ch=Character.toLowerCase(str.charAt(i));
     if(ch>='a'&&ch<='z')
       newstr=newstr+ch;
   }
   System.out.println("string without the characters="+ newstr);
  }
}
     
