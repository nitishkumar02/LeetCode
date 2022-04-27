import java.io.*;
import java.util.*;

public class SubtOfTwoArray
{

public static void main(String[] args) throws Exception 
{
    
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
	
 // 
	getSubArray(n1-1,a2,a1,n2-1) ;
	printArray(a2);
	
	
	
 }
 

public static void getSubArray(int n1 , int[] targetArray , int[] subArray ,int n2 )
{
	int sub =0;
	int carry =0;
	int c =0;
	int rem1,rem2;
	rem1=0;
	rem2=0;
	
	// loop will run ,till  bigger array inedx reached to zero
	do
	{
		// get the digits one by one from both array
		
		// till smaller array reaches to zero
		if(n1 >=0)
		{
		rem2 = subArray[n1];
		}
		else
		{
			rem2 =0;
		}
		
		rem1 = targetArray[n2];
		
		// for carry
		if(c==1)
		{
			rem1 = rem1-1;
		}
		
		// check , wether rem2 is greater than rem1
		if(rem1 < rem2 )
		{
			rem1 = rem1+10;
			c = 1;
		}
		else
		{
			c=0;
		}
		
		// do the subtraction, and assign to bigger array
	  targetArray[n2]= rem1 - rem2;
	  
	   // reduce both indexs of array
	   n2--;
	   n1--;
	   
	   
	}while(n2 >=0);
	
}
	
		
	
	
	


public static void printArray(int[] targetArray)
{
	//System.out.println("*************************");

// if just one element
	if(targetArray.length ==1)
	{
		System.out.println(targetArray[0]);
	}
	
	else
	{
		int j=0;
		// go till first non-zero is found
	   while( j < targetArray.length && targetArray[j] == 0 )
	   {
		j++;
		
	   }	
	
	
	  if( j==targetArray.length)
	   {
		   // means all are zero
		System.out.println(targetArray[j-1]);
	   }
	else
	{
		
	  for (int i =j; i < targetArray.length; i++)
	  {
		System.out.println(targetArray[i]);
	  }
	
	}
	
	}


}
}
