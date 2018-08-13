	import java.util.ArrayList;
	import java.util.List;
	import java.util.PriorityQueue;
	import java.util.Scanner;
	
	public class back_11724 {
		static int[][] arr;
		static int[] visit;
		static int n, m;
		static void dfs(int var)
		{
			visit[var] = 1;
			for(int i = 1; i <= n; i++)
			{
				if(visit[i] == 0 && arr[var][i] == 1)
				{
					dfs(i);
				}
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			n = sc.nextInt();
			m = sc.nextInt();
	
			arr = new int[n+1][n+1];
			visit = new int[n+1];		
			

			for(int i=0; i<n+1; i++)
			{
				visit[i] = 0;
			}
			
			for(int i=0; i<m; i++)
			{
				int u = sc.nextInt();
				int v = sc.nextInt();
				
				arr[u][v] = 1;
				arr[v][u] = 1;
			}
			
			int result = 0;
			for(int i=1; i<n+1; i++)
			{
				if(visit[i]==0)
				{
					result++;
					dfs(i);
				}
			}
			
			System.out.print(result);
		
		}
	}
