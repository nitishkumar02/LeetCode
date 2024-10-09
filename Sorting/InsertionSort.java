package com.multithrading.lock;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] ar = {9,6,5,0,8,2,7,1,3};

        insertionSort(ar);

        for (int n = 0; n < ar.length; n++) {
            System.out.print(ar[n] + " ");

        }

    }

    private static void insertionSort(int[] ar)
    {
        // run the array from second postion to till last element
        for (int j = 1; j < ar.length; j++)
        {
            //pick one element to compare
            int key = ar[j];
            int i = j-1;

            //now compare with all previous elements
            while(i >=0 && ar[i] > key)
            {

                //then move the element to next
                ar[i+1] = ar[i];
                //go to next element and compare
                i=i-1;
            }

            //when loop breaks,
            //means element is smaller than incoming , so put that element next to smaller element,
            ar[i+1]=key;

        }
    }
}
