/*
* https://nados.io/question/any-base-multiplication?zen=true
*/

import java.util.*;

public class AnyBaseMultiplication{

public static void main(String[] args) 
{
    Scanner scn = new Scanner(System.in);
	
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
	
	int mDigit ;
	int product =0;
	int productMultiplier =1;
	int sum =0;
	int d;
	mDigit = n2 % 10;
	
	
	do
	{
		//get the digit from multiplier ,one by one
		mDigit = n2 % 10;
		n2 =n2/10;
		
		// send multiplicand and multiplier
		 product = getProduct(b,n1,mDigit);
		 
		 //System.out.println(product);
		
		// get the sum of two number
		d = getSum(b, sum, product*productMultiplier);
		
		
		// increase the sum one postion or add zero at the end
		productMultiplier = productMultiplier*10;
		
		// assign sum of two number to sum
		sum = d;
		
	}while(n2!=0);


    
	
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2)
 {
    //declare variables
	int rem2,mult,carry,multiplier,convdigit,digit;
	multiplier = 1;
	carry=0;
	convdigit =0;
	 
	 while(n1!=0 || carry !=0)
	 {
		 // get the digit from number1 ,one by one
		 rem2 = n1%10;
		 
		 //multiply both digit extracted
		 mult = rem2 * n2;
		 
		 // if carry present , then add to multiply
		 if(carry!=0)
		 {
			 mult = mult + carry;
		 }
		 
		 // express in the form of given base, get the digit
		 digit = mult % b;
		 
		 //get the carry
		 carry = mult / b;
		 
		 //reduce the digit
		 n1 = n1/10;
		 
		  // form the digit
		  convdigit = digit * multiplier + convdigit;
		   
		  // increase the multiplier
		  multiplier = multiplier *10;
	 }
	 return convdigit;

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

		   //get extQuotient , as carry
		   extQuotient = addRemQuo / b;

		   // get extRem, as ans
		   extRem = addRemQuo % b;

		   //form the number
		   convdigit = extRem * multipler + convdigit;

		   //reduce the number
		   n1 = n1/10; 

		   n2 = n2/10;

		   //increase the multipler
		   multipler = multipler * 10;

	   }while(n1!=0 ||  n2!=0 || extQuotient!=0);

	   return convdigit;
   
 
 

 }
 }
