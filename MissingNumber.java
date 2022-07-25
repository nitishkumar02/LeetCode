/* https://leetcode.com/problems/missing-number/submissions/ */
class Solution {
    public int missingNumber(int[] nums) 
    {
        int i ,temp,correctIndex;
		i=0;
		int length1 = nums.length;
        
		// run for all elements
		while(i < length1 )
		{
			// get the correct position of elements
			correctIndex = nums[i];
            
			// see if it's at correct place
			if( nums[i] >= length1 || nums[i] == nums[correctIndex])
			{
				// move to next element
				i++;
			}
			else
			{
				// not at correctIndex, swap it to correctIndex
				temp = nums[correctIndex];
				nums[correctIndex] = nums[i];
				nums[i] = temp;
			}
		}
        // Index which does not contain correct value,is the answer
        for(int j =0; j< length1 ;j++)
        {
            if(nums[j] != j)
                return j;
        }
        //when N itself is not Present
        return length1;
        
    }
}
