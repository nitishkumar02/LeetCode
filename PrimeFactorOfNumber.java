import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        //run loop till square root of number 
        for(int i=2; i*i <= n1; i++)
        {
            // keep dividing with same num,till further it's not divisible
            while(n1 % i == 0)
            {
              n1 = n1 / i;
              System.out.print(i+" ");
            }
        }
        // Factor may lie beyond square root of n e.g 26
        if(n1 !=1)
        {
            System.out.println(n1);
        }
    }
}
