import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
	// get the length of array
	int n = a.length;

  // create a new array of same size
  int[] a1 = new int[n];
	
	int elementAtPosn =0;
	// run the loop from 0 to n-
	for(int index =0; index < n; index++)
	{
		// extract the element
		elementAtPosn = a[index];
		
		// assign the index to the elementAtPosn
		a1[elementAtPosn] = index;
	}
    return a1;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}
