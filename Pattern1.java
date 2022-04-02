/*
* https://nados.io/question/pattern-1?zen=true
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt(); 
		
        // Outer loop will run n times
        for(int row =0; row <n; row++)
        {
            // for each row , get the no of column
            // no of column is no of rows,for each row
            for (int col =0; col<=row ;col++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}