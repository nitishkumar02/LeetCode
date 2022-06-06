import java.io.*;
import java.util.*;

public class MatrixForwardReverse
{

public static void main(String[] args) throws Exception 
{
    // write your code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n1 = Integer.parseInt(br.readLine());
	int m1 = Integer.parseInt(br.readLine());
    int[][] a1 = new int[n1][m1];
	
	int i;
	int j;
	
	// for first array
	for( i = 0; i < n1; i++)
	{
		for( j = 0; j < m1; j++)
		{
			a1[i][j] = Integer.parseInt(br.readLine());
		}		
	}
	display(a1,n1,m1);
	
}

	public static void display(int[][] a1 , int n1, int m1)
	{
		//System.out.println("==============================");
		boolean flag = true;
		int j=0;
		int i;
		//outer loop will run , no of column times in 2d array
		for(int col =0; col < m1; col++)
		{
			if(flag)
			{
				// print in forward drn
				for(  i=0; i < n1 ; i++)
				{
					System.out.println(a1[i][j]);
				}
				flag = false;
				j = ++j;
				
			}
			else
			{
				// print rev drn
				
				for(  i= n1-1; i >= 0 ; i--)
				{
					System.out.println(a1[i][j]);
				}
				flag = true;
				j = ++j;
			}
		}
	}
}
