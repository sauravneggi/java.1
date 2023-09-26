import java.util.Scanner;
import java.lang.*;
class Reverse
{
  public static void main(String args[])
 {
   String str,revstr="";
   int length,i;
   Scanner scn=new Scanner(System.in);
   System.out.println("enter a string:");
   str=scn.nextLine();
   length=str.length();
   for(i=length-1;i>=0;i--)
   {
       char ch=str.charAt(i);
       revstr=revstr+ch;
   }
   System.out.println("reversed string="+revstr);
  }
}
     