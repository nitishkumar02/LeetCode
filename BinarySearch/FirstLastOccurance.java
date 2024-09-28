package com.Basics;

public class FirtsOccurance
{
    public static void main(String[] args)
    {
        FirtsOccurance firtsOccurance = new FirtsOccurance();
        int[] nums = {5,7,7,8,8,10,10,10};
        int target = 10;
        int[] nums1=  firtsOccurance.searchRange(nums,target);
        System.out.println(nums1[0] + " " + nums1[1]);

    }
    public int[] searchRange(int[] nums, int target)
    {
          //
        boolean flag =true;
        int first = Occurance(nums, target,flag);
        flag = false;
        int last = Occurance(nums, target,flag);
        int[] ansarr ={first,last};
        return ansarr;
    }

    public int Occurance(int[]arr,int target,boolean flag)
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
                if(flag) {
                     e= mid -1;
                }
                else
                {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }




}
