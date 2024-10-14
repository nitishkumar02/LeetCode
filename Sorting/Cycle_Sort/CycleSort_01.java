import java.lang.reflect.Array;
import java.util.Arrays;

public class CycleSort
{
    public static void main(String[] args)
    {
        int[] ar = {7,6,5,4 ,3 ,2, 1,0};
        cycleSort(ar);
        System.out.println(Arrays.toString(ar));

    }
    private static void cycleSort(int[] ar)
    {
        int n = ar.length-1;
        for (int iterator = 0; iterator <n;   )
        {
            // now compare,whether it is at the correct position or not
            // find the correct position of value
            int correctPos = ar[iterator]-1; //2

            // now check ,wether the position value is at right now, matches with the correct position or not
            if(iterator !=  correctPos )
            {
                // position did not match, so place the element at the correct position
                //swap
                int temp = ar[correctPos];
                ar[correctPos] = ar[iterator];
                ar[iterator]= temp;
            }
            else
            {
                // position matches, go to next element and comapre with the correct position
                iterator++;
            }

        }

    }
}
