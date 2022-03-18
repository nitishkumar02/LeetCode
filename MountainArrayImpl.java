package leetCodefun;

class MountainArrayImpl implements MountainArray
{
	public int[] arry = new int[] {0,5,3,1};
	
	public int get(int index) 
	{
		return arry[index];
	}
     public int length()
	 {
		 return arry.length;
	 }
	 
	 public static void main(String[] args)
	 {
		 int target =1;
		 
		 MountainArray mountainArr = new MountainArrayImpl();
		 int ans = MountainArraySol.findInMountainArray(target, mountainArr);
		 System.out.println(ans);
	 }
}