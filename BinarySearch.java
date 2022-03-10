/**
*
*/
class BinarySearch
{
	public static void main(String[] agrgs)
	{
		int[] arr = {2,4,6,8,12,23};
		//           0,1,2,3,4, 5
		
		
		int target = 11;
		int index = binSearch(arr,target);
		
		if(index != -1)
		{
			System.out.println("Element found at:"+ index);
		}
		else
		{
		System.out.println("Element Not found at:"+ index);
		}
		
	}
	
	public static int binSearch(int arr[], int target)
	{
		int start = 0;
		int end = arr.length-1;
		int itr =0;
		int mid=0;
		
		while(start <= end)
		{
			System.out.println("-----------------------");
			System.out.println("Iteration NO: " + itr++);
			
			 mid =  start +(end-start)/2;
			 
			System.out.println("mid :" + mid);
			
			if(arr[mid] == target)
			{
				return mid;
			}
			
			if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
			
			System.out.println("\nStart :" + start);
			System.out.println("\nEnd :"+end);
		}
		return -1;
	}
}
			
			
			