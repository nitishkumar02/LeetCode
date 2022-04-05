/*
* https://nados.io/question/pattern-5?zen=true
*/

import java.util.*;

public class Pattern3 {

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        
         int n = scn.nextInt();
		 int n1=2;
        int qutiont = n/2;
		
		int constant_one =1;
		
		int totalTabs =constant_one;
		
		int total_col = constant_one;
		
		int partDecider= qutiont+constant_one;
		
		// 1. Total no of rows is n
        for(int row =1; row <=n ; row++)
        {
			
			if( row <= partDecider)
			{
			
			   // 2. total no of tabs
			    totalTabs = qutiont -row+1;
			
			    // 3. print the tabs
			   for(int tab =1; tab <= totalTabs ; tab++)
			    {
				System.out.print("\t");
			    }
			
                // 4. for each row ,get the no of column
	
                for(int col =1; col <= total_col; col++)
               {
                System.out.print("*\t");

               }
			     total_col = total_col+2;
			
               System.out.println();
			}
			
			// when row > partDecider
			else
			{
	                 // total no of tabs
			 totalTabs = constant_one;
			  
			  // 3. print the tabs
			for(int tab =1; tab <= totalTabs ; tab++)
			{
				System.out.print("\t");
				
			}
			totalTabs = constant_one++;
	            
			  // for each row ,get the no of column
			      total_col = n-n1;
                 for(int col =1; col <= total_col; col++)
                 {
                System.out.print("*\t");
                 }
            n1=n1+2;
            System.out.println();
			
			}
			
			
        }
		
		
    }
}
