/*
*  Any Base Subtraction
* https://nados.io/question/any-base-subtraction
*/

import java.util.*;
  
  public class AnyBaseSub{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2)
   {
	//declare variables
	int rem1,rem2,digit,conv,multiplier;
	multiplier =1;
	conv=0;
	boolean flag = false;
    // extract the digit one by one
	do
	{
		rem1 = n2 % 10;
		rem2 = n1 % 10;
		
		
		if(flag)
		{
			rem1 = rem1 -1;
			
		}
		//reduce the number
		n1 = n1/10;
		n2 = n2/10;
		
		if( rem1 < rem2)
		{
			rem1 = rem1 + b;
			// set flag , if current rem of bigger number is less than smaller number remainder
			flag = true;
			//digit = rem1- rem2;
		}
		else
		{
			flag = false;
		}
		
		
		digit = rem1 - rem2;
		
		//form the digit
		conv = digit * multiplier + conv;
		
		//increase the multiplier
		multiplier = multiplier * 10;
			
	}while(n2 !=0);
	
	return conv;
	   
   }
  
  }
