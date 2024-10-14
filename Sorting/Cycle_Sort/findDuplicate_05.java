/* 
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.
Example 1:

Input: nums = [1,3,4,2,2]
Output: 2 
*/   
class Solution 
{
    public int findDuplicate(int[] nums) 
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
    
    public void swap(int[] nums , int first, int last)
    {
        int temp    = nums[first];
        nums[first] = nums[last];
        nums[last]  = temp;
    }
        
}
