import java.util.Scanner;

class PaliGame {

 public  boolean show (String b )
 {
   char [] c = b.toCharArray();
   int i=0;
   int j=c.length-1;
   while(i<=j)
   {
    if(c[i]!=c[j])
    {
        return  false;
    }
    i++;
    j--;
   }
   return   true;
 }

}


public class Palindrome{
  public static void main ( String a [])
  {
    PaliGame obj1 = new PaliGame();
    System.out.println("Welcome to Palindrome game , Please Enter Text or String Type Data :");
    Scanner scana = new Scanner(System.in);
    String pal = scana.next();
    boolean k = obj1.show(pal);
    if(k)
    {
        System.out.println(pal + " is a palindrome number");
    }
    else {
        System.out.println( pal + " is not a palindrome number");
    }
  }  
}