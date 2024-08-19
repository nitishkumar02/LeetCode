import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllDivisor {
    public static void main(String[] args) {
        int n = 38;
        //declare one set
        Set<Integer> divisorsSet = new TreeSet<>();
        // iterate from 1 to sqrt of n
        int i = 1;
        for (; i*i< n ; i++)
        {
            //check wether i divides the n
            if(n%i==0)
            {
                // add the i as divisor to set and ad the quotient as counterpart divisor
                divisorsSet.add(i);
                divisorsSet.add(n/i);
            }

        }
        // check for edge case , i.e for squre root , here ,it should be added one time only

        if(i*i ==n)
        {
            divisorsSet.add(i);
        }

        // print  the set
        System.out.println(divisorsSet);
    }
}
