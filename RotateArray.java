/*
* https://nados.io/question/rotate-an-array
*/
import java.io.*;
import java.util.*;

public class RotateArray
{
  public static void display(int[] a)
  {
    StringBuilder sb = new StringBuilder();

    for(int val: a)
	{
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k)
  {
    // write your code here
	int n = a.length;
	
	// for roataation k>n
	k = k%n;
	
	//check for k +ve or -ve
	if(k < 0)
	{
		// basically no of rotations will be now n-k roation form right for -k rotation from left
		k = n+k;
	}
	
	// call doRotate
	doRotate(a, n,k);
	
	
  }
  
  public static void doRotate(int[] a, int n , int k)
  {
	// loop will run k times for k rotation
	int lastElement =0;
	int rotn = n-1;
	for( int i = 0 ; i < k ; i++)
	{
		// get the lastElement
		lastElement = a[rotn];
		
		// now call do shift
		doShift(a, n);
		
		// after Shifting assign lastElement to first position
		a[0] = lastElement;
		
		
	}
  }
  
  public static void doShift(int[] a , int n)
  {
	// in-order to shift n elements 1 time , we need to run loop n-1 times
    // start shifting from n-2th postn
     for(int i = n-2; i>=0; i--)
	 {
		 //Reassign prev elements to next
		  a[i+1]= a[i];
	 }		 
  }
  

public static void main(String[] args) throws Exception 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
