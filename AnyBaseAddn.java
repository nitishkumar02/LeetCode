/*
* https://nados.io/question/any-base-addition?zen=true
*/

import java.util.*;
  
  public class AnyBaseAddn{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
	   //declare multipler, convdigit,remainder
	   int rem1, rem2,extQuotient;
	   extQuotient =0;
	   
	   int multipler =1;
	   int convdigit =0;
	   int extRem,addRemQuo;
	   
	   //run till ,both digit becomes zero
	   
	   do
	   {
		   // get the digit one by one
		   rem1 = n1%10;
		   rem2 = n2%10;
		   
		   addRemQuo = rem1 + rem2 +extQuotient;
		   
		   //get extQuotient
		   extQuotient = addRemQuo / b;
		   
		   // get extRem
		   extRem = addRemQuo % b;
		   
		   //form the number
		   convdigit = extRem * multipler + convdigit;
		   
		   //reduce the number
		   n1 = n1/10; 
	  
		   n2 = n2/10;
		   
		   //increase the multipler
		   multipler = multipler * 10;
		   
	   } while(n1!=0 ||  n2!=0 || extQuotient!=0);
	   
	   return convdigit;
   }
   
  }
  
