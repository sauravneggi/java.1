import java.util.*;
import java.lang.*;
class Anagram
{
  public static void main(String args[])
 {
   String str1,str2;
   Scanner scn=new Scanner(System.in);
   System.out.println("enter two strings:");
   str1=scn.nextLine();
   str2=scn.nextLine();
   char ch1[]=str1.toCharArray();
   char ch2[]=str2.toCharArray();
   Arrays.sort(ch1);
   Arrays.sort(ch2);
   str1=new String(ch1);
   str2=new String(ch2);
   if(str1.equals(str2))
    System.out.println("Anagram");
   else
    System.out.println("not anagram");
 }
}
     