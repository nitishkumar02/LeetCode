import java.io.*;
import java.util.*;

public class RotbyNityDegree {

    public static void main(String[] args) throws Exception
	{
        // write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n1 = Integer.parseInt(br.readLine());
	//int n1 = Integer.parseInt(br.readLine());
    int[][] a1 = new int[n1][n1];
	
	int i;
	int j;
	int temp;
	
	// for first array
	for( i = 0; i < n1; i++)
	{
		for( j = 0; j < n1; j++)
		{
			a1[i][j] = Integer.parseInt(br.readLine());
		}		
	}
	
	// 1. Transpose of matrix
    // for n*n matrix , outer loop will run n-1 times
	for ( i=0; i< n1-1; i++)
	{
		// swap i,j to j,i
		// j= i+1 ,since diagonal element will not be swapped
		for(j=i+1 ; j< n1; j++)
		{
			temp = a1[i][j];
			a1[i][j] = a1[j][i];
			a1[j][i] = temp;
		}
	
    }
	//display(a1);
	
	//2. Reverse the columns
	//each row will be reversed , so loop will run n times
	int start = 0;
	int end = n1-1;
	for ( i=0; i< n1; i++)
	{
		// swap elemnts in  each row
		while(start < end)
		{
			temp = a1[i][end];
			a1[i][end] = a1[i][start];
			a1[i][start] = temp;
			start++;
			end--;
		}
		start =0;
		end = n1-1;
    }
	
	display(a1);
	
	}

    public static void display(int[][] arr)
	{
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
