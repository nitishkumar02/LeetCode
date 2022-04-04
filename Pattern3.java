/*
* https://nados.io/question/pattern-3?zen=true
*/

import java.util.*;

public class Pattern3 {

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        
         int n = scn.nextInt();
        
        for(int row =1; row <=n ; row++)
        {
            // for each row ,get the spaces
            int totalSpaces = n-row;

            for(int space =1; space <= totalSpaces ; space++)
            {
                System.out.print("\t");

            }

            for(int col =1; col <= row ; col++)
            {
                System.out.print("*\t");

            }
            System.out.println();
        }
    }
}