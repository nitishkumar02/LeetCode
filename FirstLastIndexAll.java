class FirstLastIndexAll
{
	public static void main(String[] agrgs)
	{
		int[] r = leftRightSearch();
		if(r[0] != -1){
			
			System.out.println("Elemnt Found at :" + r[0]+","+r[1]);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	public static int[] leftRightSearch()
	{
		int[] arr = {1,2,2,2,4,6,8,8,12,12};
		int target = 16;
		
		//if element found , then serch in left side ,for more occurances
		boolean findLeftside = true;
		
		int lefmostIndex = binSearch(arr,target, findLeftside);
		
		//if did not find , first occurance itself , then return -1
		if(lefmostIndex == -1)
		{
			return new int[]{lefmostIndex,lefmostIndex};
		}
		
		// Go search for, right most side
		findLeftside =false;
		
		int rightMostIndex = binSearch(arr,target, findLeftside);
		
		return new int[]{lefmostIndex,rightMostIndex};
	}	
	public static int binSearch(int arr[], int target, boolean findLeftside)
	{
		//if element not found, -1,otherwise value of ans
		int ans =-1;
		int start = 0;
		int arrLength = arr.length;
		int end = arrLength-1;
		int itr =0;
		int mid=0;
		if(arrLength == 0)
		{
			return ans;
		}
		while(start <= end)
		{
			System.out.println("-----------------------");
			System.out.println("Iteration NO: " + itr++);
			 mid =  start +(end-start)/2;
			 
			System.out.println("mid :" + mid);
			
			// if target is smaller 
			if(target < arr[mid])
			{
				end = mid-1;
			}
			// if target is bigger, go to right side
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else{
				// we found one of the potential answer
				ans =mid;
				//may be , there is more in left side so, go to left side to search, till you find or while loop condition breaks
				if(findLeftside)
				{
					end = mid-1;
				}
				// no, means , not to left side,means serach in right side
				else{
					start = mid+1;
				}
			System.out.println("\nStart :" + start);
			System.out.println("\nEnd :"+end);
		     }
	}//while loop
	// you are here means, either you found the element or did not if its -1
		return ans;
} //function
}//class
