import java.util.*;
class palstring
{
   public static void main(String args[])
   {
      String original, rev = "";
      Scanner in = new Scanner(System.in);
      System.out.println("Enter string");
      original=in.nextLine();
      int length=original.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("True and result is");
      else
         System.out.println("False and result is");
      System.out.println(rev);
   }
}