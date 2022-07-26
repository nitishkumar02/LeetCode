import java.io.*;
import java.util.*;
/* https://leetcode.com/problems/find-the-duplicate-number/submissions/ */
class DuplicateNumber 
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
		 
		int d = findDuplicate(arr);
		
		System.out.println(d);
		
		 
		 
		 
		 
	} // end of main
	
	public static void display(int[] arr)
	{
		for(int i: arr)
		{
			System.out.print(i + " ");
		}
	}
	
    public static int findDuplicate(int[] nums) 
    {
        // get the length of array
        int n = nums.length;
        int i=0;
        int correctPosn =0;
        
        // run for each element of array
        while(i < n)
        {
            //compare with index
            if(nums[i] != i+1)
            {
                //number is not at it's correct position
                
                //get the correct position of element
                correctPosn = nums[i] - 1 ;
                
                // now compare with correct postion element
                if(nums[i] != nums[correctPosn])
                {
                    // swap the elemnts
                    swap(nums, i, correctPosn);
                }
                else
                {
                    // means at both places same element i.e duplicate element
                    return nums[i];
                }
                
            }
            else
            {
                //number is at it's correct position
                
                // just skip it
                i++;
            }
        }
        
        // here, means no duplicate ,so return -1;
        return -1;
    }
    
    public static void swap(int[] nums , int first, int last)
    {
        int temp    = nums[first];
        nums[first] = nums[last];
        nums[last]  = temp;
    }
        
}
