package com.binarySearch;
// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum
{
    public static void main(String[] args)
    {
        int[] ar = {7,2,5,10,8};
        int k = 2;
        int result = splitArray(ar, k);
        System.out.println(result);
    }

    public static int splitArray(int[] nums, int k)
    {
        //first find the min and max value
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++)
        {
            start = Math.max(start, nums[i]);
            // get the sum
            end = end + nums[i];
        }
        //apply binary search

        while (start <= end)
        {
            // find mid
            int mid = start + (end - start) / 2;
            // calculate how many pieces u can divide this for max sum
            int sum = 0;
            int pieces = 1;
            //current sum
            for (int num : nums)
            {
                // check current sum of num should not exceed allowed sum
                if (sum + num > mid)
                {
                    // you can not add more element to this sub array ,so make new one
                    sum = num;
                    // one sub array has been added
                    pieces++;
                } else
                {
                    //keep adding
                    sum = sum + num;
                }
            }

            // you have the pieces now,
            if (pieces > k)
            {
                start = mid + 1;
            } else
            {
                end = mid - 1;
            }
        }//while loop
       return start;
    }
}


