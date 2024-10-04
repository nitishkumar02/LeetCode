public class FindPivotElement {
    public static void main(String[] args)
    {
        int[] nums = {4,5,6,7,0,1,2};
        int pivotIndes = findPivotElementIndex(nums);
        System.out.println(nums[pivotIndes]);

    }

    private static int findPivotElementIndex(int[] nums)
    {
        int startIndex =0;
        int lastIndex = nums.length-1;
        // search till
        while( startIndex <= lastIndex )
        {
            //find mid
            int mid = startIndex + (lastIndex-startIndex)/2;

            // there will be one unique condition always ,check for that
            if( mid < lastIndex && nums[mid] >= nums[mid+1])
            {
                return mid;
            }
            if(nums[mid -1] < nums[mid])
            {
                return mid-1;
            }
            // now , elminate the search area

            //compare start and mid
            if(nums[startIndex] > nums[mid])
            {
                //menas , from mid onwards ,smallar elements are there , leave those
                lastIndex =  mid-1;
            }
            else if(nums[startIndex] < nums[mid])
            {
                //menas , left side has smaller elements
                startIndex = mid+1;
            }
        }
        return -1;

    }

}
