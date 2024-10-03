package com.test;

class Solution
{
    public boolean search(int[] nums, int target)
    {
        // find ,low anf high
        int low = 0;
        int high = nums.length-1;
        while(low <= high)
        {
            //find the mid
            int mid = low + (high-low)/2;
            //search at mid
            if(nums[mid]==target)
            {
                return true;
            }
            // foe duplicates ,shrink the search spaces
            if(nums[low]== nums[mid] && nums[mid]== nums[high])
            {
                // remove from both sides
                low = low+1;
                high =high-1;
                // go to next comaprision,by skipiing below
                continue;
            }
            // first find sorted half
            if(nums[low] <= nums[mid])
            {
                // left is sorted
                //now search ,wether target lies in betwwen the low and mid here
                if(nums[low]<=target && target <= nums[mid])
                {
                    //eleiminate the right half
                    high = mid-1;
                }
                else
                {
                    //eliminate the left half
                    low = mid +1;
                }
            }
            else
            {
                // right is sorted
                if(nums[mid]<=target && target <= nums[high])
                {
                    // eleminate the left half
                    low = mid+1;

                }
                else
                {
                    //elemiinate right half
                    high = mid-1;
                }

            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        boolean index = solution.search(nums,target);
        System.out.println(" Element Found in Sorted aaray at Index : " + index);

    }
}
