package com.cyclesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MIssingNumberinArray
{
    public static void main(String[] args)
    {
        int[] ar = {1, 1, 2};
        //int[] ar = {1, 1};
        //int[] ar = {4,3,2,7,8,2,3,1};
        //int[] ar = {1};
        cycleSor(ar);       

    }

    private static void cycleSor(int[] ar)
    {
        // run outer loop from 0 to n-1
        int n = ar.length;

        for (int i = 0; i < n ; )
        {
            // 1 based
            //nums are in the range from 1 to n
            int correctPosition = ar[i] - 1;
            //check for correct number
            if (ar[i] == ar[correctPosition])
            {
                // go to next element
                i++;
            }
            else
            {
                //swap
                int temp = ar[correctPosition];
                ar[correctPosition] = ar[i];
                ar[i] = temp;
            }

        }

        System.out.println(Arrays.toString(ar));

    }

}
