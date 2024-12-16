public class LinearSearchUsingRe {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int index=0;
        int target=5;
        boolean found= LinerSearch(ar,index,target);
        System.out.println(found);
        int index1 = LinerSearchReturnIndex(ar,index,target);
        System.out.println(index1);
    }

    private static int LinerSearchReturnIndex(int[] ar,int index,int target)
    {
        if(index== ar.length-1)
        {
            //means reachd to the last index
            //check wether it's tarrget or nt
            return ar[index]==target ? index:-1;

        }
        return ( (ar[index]==target) ? index : LinerSearchReturnIndex(ar,index+1,target) );
    }
}
