package leetCodefun;

public class MountainArraySol {
	public static int findInMountainArray(int target, MountainArray mountainArr)
	{
		int startIndex =0;
		// 1. find the peak of array ,to decide Ascending or Descending part of array
		int peak = peakIndexInMountainArray(mountainArr) ;
		
		//System.out.println("Peak Index:"+peak);
		
		 //2. Search the target in left side
		 // if element not found -1, otherwise index of found element
		int leftIndex = binSearch(mountainArr, target, startIndex , peak);
		//System.out.println("leftIndex:"+leftIndex);
		if(leftIndex == -1)
        {
	      // 3. Not found in left side, search in right side
			int RightIndex = binSearchDesc(mountainArr, target,peak+1, mountainArr.length()-1);
			//System.out.println("RightIndex " + RightIndex);
			if(RightIndex != -1)
	        {
				// found element in right side
		     return RightIndex;
	        }
			else
			{
				return -1;
				// Not found in whole array
			}
       }
		else
		{
			return leftIndex;
		}
					
	
        
    }
	
	public static int peakIndexInMountainArray(MountainArray mountainArr) 
	 {
       // get start and end of array
		int startIndex =0;
		int arrayLength = mountainArr.length();
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
		if(mountainArr.get(midIndex) > mountainArr.get(midOnePlusIndex) )
		{
			// it means , we are in descending part of array ,so move towards left
			 endIndex = midIndex;
			 
			 //keep mid , it is a potential answer
		}
		else if( mountainArr.get(midIndex) < mountainArr.get(midOnePlusIndex))
		{
			// increasing part of array, go on right to search for potentail answer
			startIndex = midOnePlusIndex;
			
			// since mid is not a potentail answer
		}
		
    } // loop breaks , start and end point to same ,larger number
	 return startIndex ;  // can return end as well
}
	
	public static int binSearch(MountainArray mountainArrinArr,int target, int start , int end)
	{
		
		
		int mid=0;
		
		
		while(start <= end)
		{
			
			
			 mid =  start +(end-start)/2;
			 
			
			
			if(mountainArrinArr.get(mid) == target)
			{
				return mid;
			}
			
			if(target > mountainArrinArr.get(mid))
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
	}
	
	public static int binSearchDesc(MountainArray mountainArrinArr,int target, int start , int end)
	{
		
		
		int mid=0;
		
		
		while(start <= end)
		{
			
			
			 mid =  start +(end-start)/2;
			 
			
			
			if(mountainArrinArr.get(mid) == target)
			{
				return mid;
			}
			
			if(target > mountainArrinArr.get(mid))
			{
				end = mid-1;
				
			}
			else
			{
				start = mid+1;
			}
			
			
		}
		// did not find element
		return -1;
	}
}
