import java.util.*;
import java.lang.*;
class Remove
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
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       continue;
     else
       newstr=newstr+ch;
   }
   System.out.println("string without the vowels="+newstr);
  }
}
     
