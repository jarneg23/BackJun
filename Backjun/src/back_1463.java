import java.util.Scanner;
public class back_1463 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[N+1];
		
		if(N<2) {
			System.out.println(0);
		}
		else if(N<4)
		{
			System.out.println(1);
		}
		else
		{
			dp[0]=0;
			dp[1]=0;
			dp[2]=1;
			dp[3]=1;
		for(int i=4;i<=N;i++)
		{
			
			if(i%3==0&&i%2==0)
			{
				if(dp[i/3]>=dp[i/2]) 
				{
					if(dp[i/2] >= dp[i-1]) { dp[i]= dp[i-1] + 1;}
					else {dp[i]= dp[i/2]+1;}
				}
				else
				{
					if(dp[i/3] >= dp[i-1]) { dp[i]= dp[i-1] + 1;}
					else {dp[i]= dp[i/3]+1;}
				}
			}
			else if(i%3==0)
			{
				if(dp[i/3]>=dp[i-1]) {dp[i]= dp[i-1]+1;}
				else {dp[i]=dp[i/3]+1;}
			}
			else if(i%2==0)
			{
				if(dp[i/2]>=dp[i-1]) {dp[i]= dp[i-1]+1;}
				else {dp[i]=dp[i/2]+1;}
			}
			else
			{
				dp[i] = dp[i-1]+1;
			}
		}
		System.out.println(dp[N]);
		}	
	}
	
	
}