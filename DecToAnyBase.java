/*
* https://nados.io/question/decimal-to-any-base?zen=true
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int co =0;
       int c=1;
       int rem=0;
       while(n>0)
       {
           //get the digit one by one
           rem = n%b;
           // place the digit to correct place
           co = rem*c+co;
           //reduce the digit
           n =n/b;
           //increase the c
           c =c*10;
       }
       return co;
   }
  }
