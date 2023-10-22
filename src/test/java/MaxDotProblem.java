
public class MaxDotProblem {
	
	public static int maxDotFind(int [] num1, int [] num2)
	{
		int n=num1.length ;
		int m=num2.length ;
		int [][] dp = new int[n+1][m+1];
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=m ; j++)
			{
				dp[i][j]=Math.max(num1[i-1]*num2[j-1]+Math.max(dp[i-1][j-1], 0),
						Math.max(dp[i-1][j], dp[i][j-1]));
			}
		}
		if(dp[n][m]==0)
			return -1 ;
		return dp[n][m];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1= {2,1,-2,5};
		int [] num2= {3,0,-6};
		int max=maxDotFind(num1,num2);
		System.out.println(max);

	}

}
