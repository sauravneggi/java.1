import java.util.*;
import java.lang.*;
class Count
{
  public static void main(String args[])
 {
   String str;
   int i,length,vowel=0,consonant=0,space=0;
   Scanner scn=new Scanner(System.in);
   System.out.println("enter a String:");
   str=scn.nextLine();
   length=str.length();
   for(i=0;i<length;i++)
  {
    char ch=Character.toLowerCase(str.charAt(i));
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       vowel++;
    else if(ch==' ')
       space++;

    else
       consonant++;
   }
   System.out.println("no. of vowels="+vowel);
   System.out.println("no. of consonants="+consonant);
   System.out.println("no. of space="+space);
  }
}