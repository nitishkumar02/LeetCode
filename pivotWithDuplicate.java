package com.binarySearch;

public class findPivotwithDuplicates {
    public static void main(String[] args) {
        int[] ar = {2,2,2,9,2,2,2};
        // find bounds of array
        int index =   pivotwithDuplicates(ar);
        System.out.println(index);
    }
    public static int pivotwithDuplicates(int[] ar)
    {
        int start =0;
        int end = ar.length-1;
        while(start <= end)
        {
            //find middle
            int mid = start + ((end -start)/2);
            // case 1 , watch out for ArrayIndexOutOfBoundsException

            if(mid < end && ar[mid] > ar[mid+1])
            {
                return  mid;
            }
            else if(mid > start && ar[mid] < ar[mid-1])
            {
                return mid-1;
            }
            // if start,middle and end are equal, skip from both end
            if(ar[start]== ar[mid] && ar[start]== ar[end])
            {
                //skip from both side
                // but before skipping check wether start is pivot or not
                if(ar[start] > ar[start+1])
                {
                    return start;
                }
                else
                {
                    //skip
                    start++;
                }
                // for end as well
                if(ar[end] < ar[end-1])
                {
                    return end-1;
                }
                else {
                    end--;
                }


            }
            // if suppose only two are equal, start=mid or start= end,then
            if(ar[start] < ar[mid] || (ar[start]== ar[mid] && ar[mid] > ar[end]))
            {
                // search in right side
                start = mid+1;
            }
            else
            {
                //search in left side
                end = mid-1;
            }
    }
        return -1;
}
}
