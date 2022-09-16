import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int original_n1 = n1;
        int original_n2 = n2;
        int temp;
        while(n2 % n1 !=0)
        {

            // get the reminder,make it new divisor
            temp = n2 % n1;
            //assign new dividend
            n2 = n1;

            //assign remainder for divisor
            n1 =temp;

        }
        System.out.println(n1);
        // n1 * n2 = lcm * gcd
        System.out.println( original_n1*original_n2/n1);
    }
}
