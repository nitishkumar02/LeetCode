/*
* https://nados.io/question/any-base-to-decimal?zen=true
*/
import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int rem =0;
      int decimalValue =0;
      int powerIncrementor =1;

      while(n>0)
      {
         // extract the digit one by one
         rem = n%10;
         // form the decimal value
         decimalValue = rem*powerIncrementor + decimalValue;
         // incement the power
         powerIncrementor = powerIncrementor*b;

         //reduce the digit
         n = n/10;
      }
      return decimalValue;
   }
  }
