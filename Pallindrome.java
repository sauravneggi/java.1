import java.util.*;
import java.lang.*;
class Pallindrome
{
  public static void main(String args[])
 {
   String str,revstr="";
   int length,i;
   Scanner scn=new Scanner(System.in);
   System.out.println("enter a String:");
   str=scn.nextLine();
   length=str.length();
   for(i=length-1;i>=0;i--)
   {
      char ch=str.charAt(i);
      revstr=revstr+ch;
   }
   if(str.equals(revstr))
     System.out.println("Pallindrome string");
   else
     System.out.println("Not a pallindrome String");
 }
}