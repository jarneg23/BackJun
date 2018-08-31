import java.util.Scanner;

public class back_9466 {

	static int dfs(int[] arr, boolean[] visit, boolean[] cycle, int start)
	{
		
		
		if(visit[start]== false)
		{
			 if(visit[arr[start]] == true)
			 {
				 return 0;
			 }
		}
		
		if(visit[arr[start]] == true && cycle[arr[start]] == true)
		{
			return 0;
		}
		else if(visit[arr[start]] == true && cycle[arr[start]] ==false)
		{
			cycle[arr[start]] = true;
			return dfs(arr,visit,cycle,arr[start]) + 1;
		}
		else
		{	
			visit[start] = true;
			visit[arr[start]]=true;
			int temp = dfs(arr,visit,cycle,arr[start]);
			
			 return temp;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int[] arr;
		boolean[] visit;
		boolean[] cycle;
		
		int c = sc.nextInt();
		int count =0;
		while(c-->0)
		{
			n = sc.nextInt();
			arr = new int[n+1];
			visit = new boolean[n+1];
			cycle = new boolean[n+1];
			count = n;
			
			for(int i=1; i<n+1; i++)
			{
				arr[i] = sc.nextInt();
				cycle[i] = false;
				visit[i] = false;
			}
			
			
			for(int i=1; i<n+1; i++)
			{
				if(visit[i] == false && cycle[i] == false)
				{
					int tp = dfs(arr,visit,cycle,i);
					count -= tp;
				}
			}
			
			System.out.println(count);
		}
		
	}

}
