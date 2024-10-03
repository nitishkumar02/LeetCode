package com.Basics;

class Solution
{
    public int search(int[] nums, int target)
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
                return mid;
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
     return -1;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int index = solution.search(nums,target);
        System.out.println("Element Found in Sorted aaray at Index : " + index);

    }
}
