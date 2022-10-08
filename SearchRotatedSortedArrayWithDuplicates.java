package com.binarySearch;

public class findPivotwithDuplicates 
{
   public int search(int[] nums, int target) 
   {
       int startIndex = 0;
		int length = nums.length;
		int endIndex = length-1;


		int pivot = pivotwithDuplicates(nums);


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
  
    public  int pivotwithDuplicates(int[] ar)
    {
        int start =0;
        int end = ar.length-1;
        while(start <= end)
        {
            //find middle
            int mid = start + ((end -start)/2);
            // case 1 , watch out for ArrayIndexOutOfBoundsException

            if(mid < end && ar[mid] > ar[mid+1])
            {
                return  mid;
            }
            else if(mid > start && ar[mid] < ar[mid-1])
            {
                return mid-1;
            }
            // if start,middle and end are equal, skip from both end
            if(ar[start]== ar[mid] && ar[start]== ar[end])
            {
                //skip from both side
                // but before skipping check wether start is pivot or not
                if(ar[start] > ar[start+1])
                {
                    return start;
                }
                else
                {
                    //skip
                    start++;
                }
                // for end as well
                if(ar[end] < ar[end-1])
                {
                    return end-1;
                }
                else {
                    end--;
                }


            }
            // if suppose only two are equal, start=mid or start= end,then
            if(ar[start] < ar[mid] || (ar[start]== ar[mid] && ar[mid] > ar[end]))
            {
                // search in right side
                start = mid+1;
            }
            else
            {
                //search in left side
                end = mid-1;
            }
    }
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
