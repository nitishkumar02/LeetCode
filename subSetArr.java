import java.io.*;
import java.util.*;

public class Main{

public static void subSetArr(String[] args) throws Exception 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
	{
       arr[i] = Integer.parseInt(br.readLine());
    }

    subArr(arr, n);
	
	
 }
 
 public static void subArr(int[] arr, int n)
 {
	 // 1. loop will run 2 power n times
	 int loopRun = (int)Math.pow(2,n);
	 
	 // make a string
	 String set = "";
	 
	 int rem,temp;
	
	 for( int it =0 ; it < loopRun ; it++)
	 {
		  // keep in temp the no ,which will be convert in binary
	  temp = it;
	  set = "";
		 //run loop till , no of elements in array,from back
		 for(int j = n-1; j>=0; j--)
		 {
			 // convert the no from 0 to 2n-1 in binary
			 
			 //get the remainder
				 rem = temp % 2;
				// reduce the number
				temp = temp /2;
				
				// if remainder is zero , add -
				if(rem ==0)
				{
					set = "-\t" + set;
				}
				else
				{
					// append the digit and the remaning string
					set = arr[j] + "\t" + set;
				}
		 }
		 // print the set
		 System.out.println(set);
	 }
 }

}
