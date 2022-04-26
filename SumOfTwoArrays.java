/*
* https://nados.io/question/sum-of-two-arrays
*/
import java.io.*;
import java.util.*;

public class SumOfTwoArrays
{

public static void main(String[] args) throws Exception {
    
	Scanner  sc = new Scanner(System.in);
    int n1 = sc.nextInt();
	
    int[] a1 = new int[n1];
	
    for(int index = 0 ; index < n1; index++)
    {
        a1[index] = sc.nextInt();
    }
	
	int n2 = sc.nextInt();
	
    int[] a2 = new int[n2];
	
    for(int index = 0 ; index < n2; index++)
    {
        a2[index] = sc.nextInt();
    }
	
	//comapre n1 and n2
	
	 if(n1 > n2)
	 {
		 // n2 is smaller, hence a2 is
		 //bigger array is a1 ,size n1
		 getSumArray(n2-1, a1, a2, n1-1);
		 printArray(a1);
	 }
	 else
	 {
		
		getSumArray(n1-1, a2, a1, n2-1);
		printArray(a2);
	 }
	
	
 }

public static void getSumArray(int min , int[] targetArray , int[] sumArray ,int d )
{
	int sum =0;
	int carry =0;
	
	// loop will run till samleer array reached to zero index or carry is not zero and bigger array inedx reched to zero
	do
	{
		if(min >=0)
		{
		sum = targetArray[d] + sumArray[min]+ carry;
		 min--;
		}
		else
		{
		     sum = targetArray[d] + carry;	
		}
		 //System.out.println("SUM is : " + sum);
		 
		targetArray[d] = sum%10;
		
		carry = sum /10;
		
		d--;
		if(d <0)
			break;
		
	}while( d >=0 || carry !=0); 
	
		
	
	
	
}

public static void printArray(int[] targetArray)
{
	//System.out.println("*************************");
	for(int a: targetArray)
	{
		System.out.println(a);
	}
}

}
