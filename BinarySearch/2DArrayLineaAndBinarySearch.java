package com.test;

public class Simple2DArrayLinearSearch
{
    public static void main(String[] args)
    {
        int[][] arr =
                {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target = 1;
        int index[] = BinarySearch2D(arr,target);

        if(index[0]!=-1)
        {
            System.out.println("Element Found at Index : " +  index[0] +" ," + index[1] );
        }
        else
            System.out.println(" Element Not found ");
    }


    private static int[] simpleLinearSearch(int[][] arr, int target)
    {
        for (int rowIndex = 0; rowIndex < arr.length ; rowIndex++)
        {
            for (int columnIndex = 0; columnIndex < arr[rowIndex].length; columnIndex++)
            {
                // now compare
                if(arr[rowIndex][columnIndex]==target)
                {
                    return new int[]{rowIndex,columnIndex};
                }
            }
        }
        return new int[]{-1,-1};
    }
//
private static int[] BinarySearch2D(int[][] arr, int target)
{
    // outer loop  will run row times
    for (int rowIndex = 0; rowIndex < arr.length ; rowIndex++)
    {
        if(arr[rowIndex][arr[rowIndex].length-1] ==target)
        {
            return new int[]{rowIndex,arr[rowIndex].length-1};
        }
        else
        {
            // for each row ,check wether target lies in the range or not
            if (arr[rowIndex][arr[rowIndex].length-1] > target)
            {
                // call binary search with the row
               int i = binarySearch(arr[rowIndex],target);
               if(i ==-1)
                   return new int[]{-1,-1};
               else
                   return new int[] {rowIndex,i};
            }
        }

    }
    return new int[]{-1,-1};
}

private static int binarySearch(int[] arr, int target)
{
    int s =0;
    int end = arr.length-1;
    while(s <= end)
    {
        int mid = s + (end-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        } else if (arr[mid] > target) {
            end = mid-1;

        }
        else
        {
            s = mid +1;
        }

    }
    return -1;
}



}
