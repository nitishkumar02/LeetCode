//LinearSearchUsingRecursion
public class LinearSearchUsingRe {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int index=0;
        int target=6;
        boolean found= LinerSearch(ar,index,target);
        System.out.println(found);
    }

    private static boolean LinerSearch(int[] ar,int index,int target)
    {
        if(index== ar.length-1)
        {
            //means reachd to the last index
            //check wether it's tarrget or nt
            return ar[index]==target ? true:false;

        }
        return (ar[index]==target || LinerSearch(ar,index+1,target));
    }
}
