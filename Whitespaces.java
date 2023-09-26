import java.util.Scanner;
import java.lang.*;
class Whitespaces
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
     char ch=str.charAt(i);
     if(ch==' ')
       continue;
     else
       newstr=newstr+ch;
   }
   System.out.println("string without the whitespaces="+ newstr);
  }
}
     
