import java.io.*;
import java.util.*;

public class MatrixMul
{

public static void main(String[] args) throws Exception 
{
    // write your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n1 = Integer.parseInt(br.readLine());
	int m1 = Integer.parseInt(br.readLine());
    int[][] a1 = new int[n1][m1];
	
	int i=0;
	int j=0;
	
	// for first array
	for( i = 0; i < n1; i++)
	{
		for( j = 0; j < m1; j++)
		{
			a1[i][j] = Integer.parseInt(br.readLine());
		}		
	}
	
	// for secod array
	int n2 = Integer.parseInt(br.readLine());
	int m2 = Integer.parseInt(br.readLine());
    int[][] a2 = new int[n2][m2];
	
	for( i = 0; i < n2; k++)
	{
		for( j = 0; j < m2; l++)
		{
			a2[i][j] = Integer.parseInt(br.readLine());
		}		
	}
    
	//check if ,matrix can be multiplied or not
	//column of ist arr == row of 2nd arr
	if(m1!=n2)
	{
		System.out.print("Invalid input");
	}
	else
	{
		// call fun: matrixMul
		int[][] a3 = matrixMul(a1,  a2,  n1, n2, m1, m2);
		   
		// display this two-d resultant array
		   display(a3);
	}
	
 }
 
 public static int[][] matrixMul(int[][] a1, int[][] a2, int n1,int n2,int m1,int m2)
 {
	 //delclare a third array of size {row of 1st matrix * column of 2nd matrix},n1*m2
	 int[][] a3 = new int[n1][m2];
	 
	 int sum =0;
	 int inc =0;
		//outer loop , for each row, in first matrix,
		for(int out =0; out < n1; out++)
		{
			//for each column in 2nd matrix, run till each column is covered
			for(int col =0; col <m2; col++)
			{
				//  for each element in one column of 2nd matrix , run till no of rows in 2nd matrix
				for( inc=0; inc < n2; inc++)
				{
					sum = a1[out][inc] * a2[inc][col] + sum;
					
				}
				
				// assign the result to result array
				a3[out][col] = sum;
				sum =0;
			}
		}
		return a3;
 }
 
 // display the 2-d array
 public static void display(int[][] a3)
 {
	 for(int[] a1: a3)
	 {
		 for(int e1 : a1)
		 {
			 System.out.print(e1 +" ");
		 }
		 System.out.println();
	 }
 }
 
 } // end of calss

