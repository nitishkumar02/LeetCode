/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums. 
*/
class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length; //3
        int expSum = 0;
        int actSum = 0;
         // missing num = Expected Sum - Actual Sum
        // n-> 3,2,1
        while(n > 0)
        {
            expSum = expSum + n; // 3+2+1
            actSum = actSum + nums[n-1];
            n--;
        }
        return expSum - actSum;
 }
}


//2nd way
class Solution {
    public int missingNumber(int[] nums) 
    {
        sortCyclic(nums);
        return missingNumber1(nums);
    }
    
    public void sortCyclic(int[] ar) 
    {
        // run loop n times
        int index = 0;

        int N = ar.length;

        while(index < N)
        {
            // get the correct position of element
            //  since range is 0 to n, element value = index value
            int correctPosition = ar[index] ;

            //check if current element is equal to element at correct position
            if(correctPosition == N || ar[index] == ar[correctPosition])
            {
                // move to next element
                index++;
            }
            else if (ar[index] != ar[correctPosition])
            {
                //not equal ,swap
                int temp = ar[correctPosition];
                ar[correctPosition] = ar[index];
                ar[index]= temp;
            }
        }
    }
    
    public int missingNumber1(int[] ar)
    {
        //scan the array ,the element which is not present at it's correct place is missing number
        // element = index
        int N = ar.length;
        for (int i = 0; i < N; i++)
        {
            if(ar[i] != i)
            {
                return i;
            }
        }
        // if all are at correct index, then return N
        return N;
    }

    
}
