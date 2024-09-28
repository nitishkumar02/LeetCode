package com.Basics;

public class FirtsOccurance
{
    public static void main(String[] args)
    {
        int[] arr = {5,7,7,8,8,10,10,10};
        int target = 10;
        int first =firstOccurance(arr,target);
        System.out.println("First Occurance :" + first);

    }
    public static int firstOccurance(int[]arr,int target)
    {
        int ans=-1;
        int s=0;
        int e = arr.length-1;
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(target > arr[mid])
            {
                s = mid+1;

            } else if (target < arr[mid])
            {
                e = mid-1;
            }
            else
            {
                ans = mid;
                //but more code but on left side
                e = mid-1;
            }
        }
        return ans;
    }
}
