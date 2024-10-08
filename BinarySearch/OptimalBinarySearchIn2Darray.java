package com.test;



public class OptimalBinarySearchIn2Darray {

    public static void main(String[] args)
    {
        int[][] arr =
                {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}
                };
        int target = 114;

        int index[] = binarySearch( arr,  target);

        if(index[0]!=-1)
        {
            System.out.println("Element Found at Index : " +  index[0] +" ," + index[1] );
        }
        else
            System.out.println(" Element Not found ");
    }

    private static int[] binarySearch(int[][] arr, int target)
    {
        int s =0;
        int end = arr[0].length * arr.length -1;

        int columnLength = arr[0].length;

        while(s <= end)
        {
            int mid = s + (end-s)/2;

            //find the position of mid in 2d aaray
            int row = mid/columnLength;
            int col = mid%columnLength;

            if(arr[row][col]== target)
            {
                return new int[]{row ,col};
            }
            else if (arr[row][col] > target)
            {
                end = mid-1;

            }
            else
            {
                s = mid +1;
            }

        }
        return new int[]{-1,-1};
    }

}
