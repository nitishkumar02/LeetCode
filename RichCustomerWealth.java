/**
 *
 */
class RichCustomerWealth {

	public static void main(String[] args)
	{
		int[][] acc ={
			{1,2,3}
			,{4,5,7}
		};
		int r = maximumWealth(acc);
		System.out.println(r);

	}
    public static int maximumWealth(int[][] accounts) {

        int max =0;
        int sum =0;

        for(int r=0; r<accounts.length; r++)
        {

            for(int c=0; c< accounts[r].length;c++)
            {
                sum = sum+accounts[r][c];
            }

            if(sum > max)
            {
                max = sum;
            }
            sum=0;
        }
        return max;
    }
}
