import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first =0;
        int last =1;
        //all three variables act as pointer , move one step ahead in each step
        for(int i=0; i <n ; i++)
        {
            //print Fib no
            System.out.println(first);

            // third pointer is found by adding prev two term 
            int current= first + last;

            //assign last ,to first i.e. move 1 step ahead
            first = last;

            // assign current to last i.e. move 1 step ahead
            last = current;
        }

    }
}
