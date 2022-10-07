class Solution {
    public int search(int[] nums, int target) {
       int startIndex = 0;
		int length = nums.length;
		int endIndex = length-1;
		
		
		int pivot = findPivot(nums);
		
		
		// case 1: if no pivot , means nums is already in sorted ,do normal binary search
		if(pivot == -1)
			return binSearch(nums, target, startIndex , endIndex);
		
		// case 2: found the pivot ,
		//search if it is target
		if( nums[pivot] == target)
			return pivot;
		
		// case 3: if target is bigger than startIndex element , means seach form startIndex to pivot-1, after pivot all elements will be smaller
		if(target >= nums[startIndex])
		{
		return binSearch(nums, target, startIndex , pivot-1);
	    }
		
		else
		{
			// if target is smaller than startIndex element , means 
			// search after pivot element
			startIndex = pivot+1;
			return binSearch(nums, target, startIndex , endIndex);
		} 
    }
    
    public int findPivot( int[] nums)
	{
		// get start and end index
		int startIndex = 0;
		int length = nums.length;
		int endIndex = length-1;
		int mid =0;
		 
		 // start searching 
		 while(startIndex <= endIndex)
		 {
			 mid = startIndex + (endIndex-startIndex)/2;
			 
			 // 1st unique condtion exists 1,2,3,4,8,7,6 around biggest element here for 8
			 if(mid <endIndex && nums[mid] >= nums[mid+1])
			 {
				 return mid;
			 }
			 // 2nd unique condtion exists 1,2,3,4,8,6 ,5 around biggest element here for 6
		 if( mid >startIndex && nums[mid] < nums[mid-1])
		 {
			 // come to left side
			 return mid-1;
		 }
		 
		 // 3rd , comapre with startIndex element , 10,9,2,4,6,8 with midElemnt 
		 // if greater ,means all element from mid to end will be samller than start., so reduce the search space
		 if( nums[startIndex] > nums[mid])
		 {
			 endIndex = mid-1;
		 }
		 else
		 {
			 //3rd , comapre with startIndex element , 2,4,6,8,10,23 with midElemnt 
			// if smaller ,means all element from start till mid-1, will be smaller than mid., so reduce the search space
			// not taking mid ,since if it was, it would have returned in case 1 and 2
			startIndex = mid +1;
		 }
		 
		
		 
		 }
		 //did not find element
		 return -1;	
	}
    
    public int binSearch(int[] nums,int target, int start , int end)
	{


		int mid=0;


		while(start <= end)
		{


			 mid =  start +(end-start)/2;



			if(nums[mid] == target)
			{
				return mid;
			}

			if(target > nums[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}


		}
		// did not find element
		return -1;
		
	} // end of fun
    
    
    
}
