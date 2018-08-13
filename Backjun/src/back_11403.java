import java.util.Scanner;
public class back_11403 {

	static void dfs(int[][] ar, int[][] res, int start, int num, int top)
	{
		for(int j = 1; j < num; j++)
		{
			if( ar[start][j] == 1 && res[top][j] == 0)
			{
				res[top][j] = 1;
				dfs(ar,res,j,num,top);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] list = new int[N+1][N+1];
		int[][] result = new int[N+1][N+1];
		
		for(int i=1; i<N+1;i++)
		{
			for(int j=1; j<N+1;j++)
			{
				list[i][j] = sc.nextInt();
				result[i][j] = 0;
			}
		}
		
		for(int i = 1; i<N+1;i++)
		{
			dfs(list, result ,i, N+1,i);
		}
		
		for(int i=1; i<N+1;i++)
		{
			
			for(int j=1; j<N+1;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
