/* https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/ */
class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
       // List<Integer> missedNumList = new ArrayList<Integer>();
        
        cSort(nums);
        List<Integer> lr = cFindMissing(nums);
        return lr;
        
        
    }
    public List<Integer> cFindMissing(int[] nums)
    {
        List<Integer> missedNumList = new ArrayList<Integer>();
        
        int index=0;
        
        // run for all elements
        while(index < nums.length)
        {
            //compare each element is present at it's correct position or not
            if(nums[index] != index+1 )
            {
        
            missedNumList.add(index+1) ;
                
            }
            
            index++;
        }
        
        return missedNumList;
        
    }
    
    public void cSort(int[] arr)
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
