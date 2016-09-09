import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int no, rev = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      no = in.nextInt();
 
      while( no != 0 )
      {
          rev = rev * 10;
          rev = rev + n%10;
          no = no/10;
      }
 
      System.out.println("Reverse of entered number is "+rev);
   }
}
