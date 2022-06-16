import java.io.*;
import java.util.*;

public class MatrixDisplaySpiral
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
	#System.out.println("--------------------");
	display(a1,n1,m1);
	
}

	public static void display(int[][] a1 , int n1, int m1)
	{
		int rmin=0;
		int cmin = 0;
		int rmax = n1-1;
		int cmax = m1-1;
		int i,j;
		int length = n1*m1;
		int r =length;
		int count =0;
		
		// at last, there may be chance of ,not having elemnt to complete all loop , so put check for no of elements
		// Left wall
		while(count <length)
		{
			for(i = rmin , j = cmin; (i <= rmax )&& (count <length); i++ )
			{
				System.out.println(a1[i][j]);
				count++;
			}
			// skip at rmax element bottom left
			cmin++;
				
			//Bottom wall
			for(j = cmin , i = rmax; j <= cmax && count <length ; j++ )
			{
				System.out.println(a1[i][j]);
				count++;
			}
			
			// skip at cmax element bottom right
			rmax--;
			
			//right wall
			for(i = rmax , j = cmax; i >= rmin && count <length; i-- )
			{
				System.out.println(a1[i][j]);
				count++;
			}
			//skip at rmin elemnt at upper left
			cmax--;
			
			//upper wall
			for(j = cmax , i = rmin; j >= cmin && count <length; j-- )
			{
				System.out.println(a1[i][j]);
				count++;
			}
			// increment 
			rmin++;
		}
	}
}
