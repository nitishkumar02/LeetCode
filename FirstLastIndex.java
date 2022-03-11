class FirstLastIndex
{
	public static void main(String[] agrgs)
	{
		int[] arr = {2,2,4,6,8,8,12,12};
		//           0,1,2,3,4, 5
		
		
		int target = 6;
		int[] index = binSearch(arr,target);
		
		if(index[0] != -1)
		{
			System.out.println("Element found at:"+ index[0]+',' +index[1]);
		}
		else
		{
		System.out.println("Element Not found at:"+ index[0] +index[1]);
		}
		
	}
	
	public static int[] binSearch(int arr[], int target)
	{
		int start = 0;
		int arrLength = arr.length;
		int end = arrLength-1;
		int itr =0;
		int mid=0;
		
		if(arrLength == 0)
		{
			return new int[]{-1,-1};
		}
		
		
		while(start <= end)
		{
			System.out.println("-----------------------");
			System.out.println("Iteration NO: " + itr++);
			
			 mid =  start +(end-start)/2;
			 
			System.out.println("mid :" + mid);
			
			if(arr[mid] == target)
			{
				//return mid;
				int beMidIndex = mid-1;
				int afMidIndex = mid+1;
				if(beMidIndex != -1 && arr[beMidIndex] == target)
				{
					return new int[]{beMidIndex,mid};
				}
				if(afMidIndex != arrLength && arr[afMidIndex] == target)
				{
					return new int[]{mid,afMidIndex};
				}
				return new int[] {mid,mid};
			}
			
			if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
			
			System.out.println("\nStart :" + start);
			System.out.println("\nEnd :"+end);
		}
		return new int[]{-1,-1};
	}

}
