/*
* Time Complexity:
Getting the number of digits in n will take O(log10 n) time.
Finding 10k and 10(nod - k) will take O(k) and O(nod - k) time respectively ,
since k is ,of the order of the number of digits (after taking mod with nod), 
its time complexity will also be O(log10 n).

Finding q and r are constant time-taking operations. 
Hence, the overall time complexity will be O(number of digits) = O(log10 n).

 * Space Complexity:
We are just using integer variables nod, multiplier, divisor, r, q, which will take constant {O(1)} space.

* https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate_a_number/topic
*/


import java.util.*;

import java.lang.*;
import java.io.*;
public class RotateDigit {
	
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
	
    int nod = 0; //number of digits
    int temp = n;  //temporarily storing number to perform division while(temp != 0)
	
    
   //get the length of digit
   while(temp!=0)
    {
      temp /= 10;
      nod++;
    }
	
	// special case , in case k > length(digit)
	k = k % nod;
	
	 // specail case , in case k is negative
     if(k <0)
	 {
		  k = k + nod;
	 }
	
	
	
	if(k<0)
	{
		k = k * -1;
	}
	 
	//System.out.println("k :"+k);
	
	// Basically , forming Divisor and Multiplier
	
    int div = 1; //initialize divisor = 1
    int mult = 1; //initialize multiplier = 1
    for (int iTerator = 1; iTerator <= nod; iTerator++)
    {
		//while the iterator is less than k
      if (iTerator <= k)
        
      {
        //we increase the value of divisor
        div *= 10;
		
      }
	  
      else
	  {
        //or else we increase the value of multiplier 
        mult *= 10;
	  }
    }
  
  
  
  int rem = n % div;  // extracting the remainder
  int quo = n/div;    // extracting the quotient int quo = n / div;
  
  int rotatedNumber = rem * mult + quo;
  
  //forming the rotated number
  
  System.out.println(rotatedNumber);
}
  }


