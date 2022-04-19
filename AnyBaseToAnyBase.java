/*
*  https://nados.io/question/any-base-to-any-base?zen=true
*/


import java.util.*;

  public class AnyBaseToAnyBase{

  public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
	  
	  int sourceBase = scn.nextInt();
	  
      int  destBase= scn.nextInt();
      
	 
      
	  int decimalValue = getValueIndecimal(n, sourceBase);
      //System.out.println(decimalValue);
	  
	  int dn = getValueInBase(decimalValue, destBase);
      System.out.println(dn);
	  
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
   
   public static int getValueInBase(int n, int b){
       // write code here
       int formedDigit =0;
       int powerIncrementor=1;
       int rem=0;
       while(n>0)
       {
           //get the digit one by one
           rem = n%b;
           // place the digit to correct place
           formedDigit = rem*powerIncrementor+formedDigit;
           //reduce the digit
           n =n/b;
           //increase the powerIncrementor
           powerIncrementor =powerIncrementor*10;
       }
       return formedDigit;
   }
   
   
   
  }
