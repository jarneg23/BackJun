import java.util.Scanner;

public class back_1743 {
	
	static int directionX[] = { 0,0,-1,1 };
	static int directionY[] = { -1,1,0,0 };

	static int dfs(int[][] data , int x, int y, int m, int n)
	{
		int value = data[x][y];
		data[x][y] = 0;
		for(int i=0; i<4;i++)
		{
			if(x+directionX[i] >=0 && y+directionY[i] >=0 &&
			   x+directionX[i] <=m && y+directionY[i] <=n)
			{
				if(data[x+directionX[i]][y+directionY[i]]==1) 
				{
					
                    value += dfs(data,x+directionX[i],y+directionY[i],m,n);
				}
			}
		}
		return value;
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M , N, K;
		M = sc.nextInt();
		N = sc.nextInt();
		K= sc.nextInt();
		int result =0;
		int data[][] = new int[M+1][N+1];
		for(int i=0;i<M+1;i++)
			for(int j=0;j<N+1;j++) data[i][j] = 0;
		
		for(int i=0; i<K;i++)
		{data[sc.nextInt()][sc.nextInt()]+=1;}

		for(int i=0;i<M+1;i++)
			for(int j=0;j<N+1;j++) 
			{
				if(data[i][j] >= 1)
				{
					int temp = dfs(data,i,j,M,N);
					if(temp >= result)
					{result = temp;}
				}
			}
		
		System.out.print(result);
		
	}

}


