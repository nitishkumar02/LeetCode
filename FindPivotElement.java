class FindPivotElement
{
	public static void main (String[] args)
	{
		int[] arr = new int[]{12,1,2,3,4,5,6};
		int target = 4;
		int pivot = findPivot(arr);
		System.out.println(pivot);
		
	}
	
	public static int findPivot( int[] arr)
	{
		// get start and end index
		int startIndex = 0;
		int length = arr.length;
		int endIndex = length-1;
		int mid =0;
		 
		 // start searching 
		 while(startIndex <= endIndex)
		 {
			 mid = startIndex + (endIndex-startIndex)/2;
			 
			 // 1st unique condtion exists 1,2,3,4,8,7,6 around biggest element here for 8
			 if(mid <endIndex && arr[mid] >= arr[mid+1])
			 {
				 return mid;
			 }
			 // 2nd unique condtion exists 1,2,3,4,8,6 ,5 around biggest element here for 6
		 if( mid >startIndex && arr[mid] < arr[mid-1])
		 {
			 // come to left side
			 return mid-1;
		 }
		 
		 // 3rd , comapre with startIndex element , 10,9,2,4,6,8 with midElemnt 
		 // if greater ,means all element from mid to end will be samller than start., so reduce the search space
		 if( arr[startIndex] > arr[mid])
		 {
			 endIndex = mid-1;
		 }
		 else
		 {
			 //3rd , comapre with startIndex element , 2,4,6,8,10,23 with midElemnt 
			// if smaller ,means all element from start till mid-1, will be smaller than mid., so reduce the search space
			// not taking mid ,since if it was, it would have returned in case 1 and 2
			startIndex = mid +1;
		 }
		 
		
		 
		 }
		 //did not find element
		 return -1;	
	}
}
