public class SortedArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int index =0;
        boolean chk = SortedArryCheck(ar ,index);
        System.out.println(chk);
    }
// 1  3 4 5 6
    private static boolean SortedArryCheck(int[] ar,int index) {
       if(index == ar.length-1)
       {
           return true;
       }
       return ar[index] < ar[index+1] && SortedArryCheck(ar,index+1);
    }
}
