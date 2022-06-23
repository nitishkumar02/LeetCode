import java.io.*;
import java.util.*;
//https://nados.io/question/exit-point-of-a-matrix
public class MazeExit
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
	
	// initialize the vars
	i =0;
	j=0;
	int dir =0; // 0 =east,1 = south,2=west,3=north
	while(true)
	{
		// add each element to direction
		dir = (dir + a1[i][j])%4;
		
		if(dir == 0)
		{
			j++;
		}
		else if(dir == 1)
		{
			i++;
		}
		else if(dir ==2)
		{
			j--;
		}
		else if(dir ==3)
		{
			i--;
		}
		
		// braek condn form matrix, inc or dec index to return proper inedx no
		if(i<0)
		{
			i++;
			break;
		}
		else if(j<0)
		{
			j++;
			break;
		}
		else if(i== a1.length)
		{
			i--;
			break;
		}
		else if( j == a1[0].length)
		{
			j--;
			break;
		}
			
	} // end of traversal
	System.out.println(i);
	System.out.println(j);
}
}
