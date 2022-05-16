import java.io.*;
import java.util.*;
public class celiFloorArray{

public static void main(String[] args) throws Exception 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
	{
       arr[i] = Integer.parseInt(br.readLine());
    }

   int t = Integer.parseInt(br.readLine());
   celiFloor(arr, n, t);
	
	
 }
 
 public static void celiFloor(int[] arr,int n, int t)
 {
	 int start =0;
	 int end = n-1;
	 int mid;
	 
	 while(start <= end)
	 {
		 mid = start + (end - start)/2;
		 
		 if(arr[mid] == t)
		 {
			 System.out.println(t);
			 System.out.println(t);
			 return;
		 }
		 else if( t < arr[mid])
		 {
			 end = mid-1;
		 }
		 else
		 {
			 start = mid+1;
		 }
	 } // if here, did not find
	 // start has crossed end, so end points to smaller elemant than target
	 if( end+1 > n-1)
	 {
		 // end+1 might go beyond length of array, for floor number,so put check
		 System.out.println(arr[end]);
		 System.out.println(arr[end]);
	 }
	 else{
		 System.out.println(arr[end+1]);
		 System.out.println(arr[end]);
		 
	 }
	 
 }
}
