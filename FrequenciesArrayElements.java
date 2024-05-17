//Frequencies of Limited Range Array Elements
// https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

import java.io.*;
import java.util.*;

class GFG
{

    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //testcases
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            //size of array
            int N = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N];
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            //adding elements to the array
            for(int i = 0 ; i < N; i++)
            {
                arr[i]=Integer.parseInt(inputLine[i]);
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequencyCount() function

            Solution.frequencyCount(arr, N, P);

            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );

            System.out.println();
        }
    }
}

class Solution
{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int[] arr, int N, int P)
    {
        // declare one hashmap
        HashMap<Integer,Integer > mapElement = new HashMap<Integer,Integer >();
        // first get the frequency of each element ,in map as key-value pair
        // key will be element and frequency as value
        for(int i = 0; i < arr.length ; i++)
        {
            // Check map contains the key or not
            // if contains get  the frequency
            int key = arr[i];
            int fre =0;
            if(mapElement.containsKey(key))
            {
                fre = mapElement.get(key);
            }
            //  increase and put it to hash map
            fre++;
            mapElement.put(key, fre);
        }
        // now query for each element in the range 1 to N.
        //if null , print 0
        for(int element =0; element < arr.length  ; element++)
        {
            // check for element value pair
            if(mapElement.containsKey(element+1))
            {
                // print the frequency i.e tha value
                //System.out.print(mapElement.get(element) +" ");
                arr[element] = mapElement.get(element+1);
            }
            else
            {
                //print 0
                //System.out.print(0 +" ");
                arr[element] = 0;
            }
        }

    }
}
