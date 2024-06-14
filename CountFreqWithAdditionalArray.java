package com.step1.Lec6;

public class ContFrequency {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        // First loop will run for all elements
        for(int i =0; i < n; i++)
        {
            // check if already counted , if it is, skip to next element
            if(visited[i]==true)
            {
                continue;
            }

            // make count for element
            int count =1;

            // Iterate from 2nd elements onwards, increment count if found, and mark it visited
            for(int j = i+1; j<n ; j++)
            {
                if(arr[i] ==  arr[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            // print the count/frequency
            System.out.println("Element "+arr[i]+" Freq "+ count);

        }
    }
}

