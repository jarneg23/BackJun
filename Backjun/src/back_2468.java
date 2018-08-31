import java.util.Scanner;


class back_2468 {
	
	static class pair
	{
		int N;
		boolean V;
		pair(int n, int height)
		{
			N = n;
			if(n <= height) {V = true;}
			else {V= false;}
		}
		
		void init(int t)
		{
			if(N <= t) {V = true;}
			else
			{
				V = false;
			}
		}
	}

	
	static void dfs(pair[][] p, int row, int col)
	{
		int temp = 1;
		int length = p.length;
		p[row][col].V = true;
		
		if(col < length-1 && p[row][col+1].V == false)
		{
			dfs(p,row,col+1);
		}
		
		if(row < length-1 && p[row+1][col].V == false)
		{
			 dfs(p,row+1,col) ;
		}
		
		if(col > 0 && p[row][col-1].V == false)
		{
			dfs(p,row,col-1);
		}
		
		if(row > 0 && p[row-1][col].V == false)
		{
			dfs(p,row-1,col);
		}
	}
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		pair[][] arr = new pair[N][N];
		
		for(int i=0; i<N; i++)
			for(int j=0;j<N;j++)
				arr[i][j] = new pair(sc.nextInt(),0);
			
		int result = 0;
		int max = 0;
		for(int k=0; k<101;k++)
		{
			result = 0;
			
			for(int i=0; i<N; i++)
				for(int j=0;j<N;j++)
				{
					arr[i][j].init(k);
				}
			
			for(int i=0; i<N; i++)
				for(int j=0;j<N;j++)
					{
						if(arr[i][j].V == false)
							{
								dfs(arr,i,j);
								result++;
							}
					}
			
			max = max<=result? result: max;
		}
		
		System.out.println(max);
	}

}
