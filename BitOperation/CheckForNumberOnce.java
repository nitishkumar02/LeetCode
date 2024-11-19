package com.example.demo;

public class CheckForNumberOnce
{
    public static void main(String[] args)
    {
        int[] ar = {2,3,4,1,2,1,3,6,4,8};
        // scan for each
        int l = ar.length;

        int j=0;
        //run loop from 1 to l-1
        for (int i = 0; i <=l-1 ; i++)
        {
            // get the no
            int num1 = ar[i];
            //compare from next number
            for ( j = i+1; j <l ; j++)
            {
                if(num1 == ar[j] && (num1 !=Integer.MAX_VALUE))
                {
                    //set the max number
                    ar[j] = Integer.MAX_VALUE;
                    break; //go to next number
                }

            }
            // it's true ,means
            if(j==l && (num1 !=Integer.MAX_VALUE))
            {
                //no duplicate exist
                // print that number
                System.out.println(num1);
            }
            //here means

        }
    }
}
