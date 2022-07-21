import java.io.*;
import java.util.*;
class CyclicSort 
{
	public static void main(String[] args)throws Exception
	{
		// Initialize input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 // ask for no of elements
		 int n = Integer.parseInt(br.readLine());
		 int[] arr = new int[n];
		 
		 // get elements in array
		 for(int i =0; i<n; i++)
		 {
			 arr[i] = Integer.parseInt(br.readLine());
		 }
		 
		 display(arr);
		 
		 //call cyclic sort function
		 cSort(arr);
		 
		 
		 //display
		 display(arr);
		 
	} // end of main
	
	public static void display(int[] arr)
	{
		for(int i: arr)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void cSort(int[] arr)
	{
		int i ,temp,correctIndex;
		i=0;
		int length1 = arr.length;
		// run for all elements
		while(i < length1 )
		{
			// get the correct position of elements
			correctIndex = arr[i] - 1;
			// see if it's at correct place
			if( arr[i] == arr[correctIndex])
			{
				// move to next element
				i++;
			}
			else
			{
				// not at correctIndex, swap it to correctIndex
				temp = arr[correctIndex];
				arr[correctIndex] = arr[i];
				arr[i] = temp;
			}
		}
				 	
	}
}
