public class UniqueExample
{
    public static void main(String[] args)
    {
        int[] ar = {2,3,4,1,2,1,3,6,4};
        // scan for each
        int l = ar.length;

        int j=0;
        int inital = ar[0];
        //run loop from 1 to l-1
        for (int i = 1; i <l ; i++) {
            inital = inital ^ ar[i];

        }
        System.out.println(inital);
    }
}
