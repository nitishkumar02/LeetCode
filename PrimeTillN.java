import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int count =0;
        // 2 <= low < high < 10 ^ 6
        while(low <= high)
        {
            // run loop from 2 to till square root of every number coming in low
            for(int i=2; i*i <= low; i++)
            {
                //check for divisibility
                if(low % i == 0)
                {
                    //increment a count variable and break
                    count ++;
                    break;
                }
            }
            if(count ==0)
            {
                System.out.println(low);
            }
            // increase low
            low++;
            //reset the count
            count =0;

        }
    }
}
