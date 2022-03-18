/**
* https://leetcode.com/problems/find-peak-element/
*/
class PeakIndexMountain
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {0,1,0,12,23,7,6,5};
		int peak = peakIndexInMountainArray(arr);
		System.out.println(peak);
	}
	
	 public static int peakIndexInMountainArray(int[] arr) 
	 {
        // get start and end of array
		int startIndex =0;
		int arrayLength = arr.length;
		int endIndex = arrayLength -1;
		int midIndex =0;
		int midOnePlusIndex = 0;
		
		// start searching
		
		while(startIndex < endIndex)
		{
			//1st get the mid
			 midIndex = startIndex + (endIndex - startIndex)/2;
			 midOnePlusIndex = midIndex+1;
			 
			//compare if mid element is greater than mid+1 element
		if(arr[midIndex] > arr[midOnePlusIndex] )
		{
			// it means , we are in descending part of array ,so move towards left
			 endIndex = midIndex;
			 
			 //keep mid , it is a potential answer
		}
		else if( arr[midIndex] < arr[midOnePlusIndex])
		{
			// increasing part of array, go on right to search for potentail answer
			startIndex = midOnePlusIndex;
			
			// since mid is not a potentail answer
		}
		
     } // loop breaks , start and end point to same ,larger number
	 return startIndex ;  // can return end as well
}
}
