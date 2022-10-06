package com.binarySearch;

public class InfiniteBinaSearch
{
    public static void main(String[] args)
    {
        int[] ar = {2,3,4,5,6,7,9,18,19,20,23,34,45,56,57,58,59,60};
        int target = 19;

        // find bounds of array
        int index = findBound(ar,target);
        System.out.println(index);
    }

    private static int findBound(int[] ar,int target)
    {
        int start =0;
        int end = 1;

            if(target > ar[end])
            {
                // find new bounds
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            }
            // call binary search
        return binSearch(ar, target, start, end);
    }
    private static int binSearch(int[] ar, int target, int start, int end)
    {
        while(start <= end)
        {
            //find middle
            int mid = start + (end - start) / 2;

            // if mid is targeted element
            if (ar[mid] == target)
            {
                return mid;
            }
            if (target > ar[mid])
            {
                // move to right side,since left side ,will only get smaller element than target
                start = mid + 1;
            }
            else if (target < ar[mid])
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
