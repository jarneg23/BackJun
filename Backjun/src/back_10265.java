import java.util.Scanner;

public class back_10265 {

	static class pair
	{
		int n;
		boolean visit;
		pair(int N)
		{
			n = N;
			visit = false;	
		}
	}
	static int dfs(pair[] arr, int n)
	{
		arr[n].visit = true;
		
		if(arr[arr[n].n].visit == false)
		{
			return dfs(arr,arr[n].n) + 1;
		}
		else
		{
			return 1;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] temp = new int[N];
		pair[] arr = new pair[N+1];
		int count = 0;
		for(int i=1; i<N+1;i++)
		{
			arr[i] = new pair(sc.nextInt());
		}
		
		int max =0;
		for(int i=1; i<N+1; i++)
		{
			for(int j=1; j<N+1; j++)
			{
				arr[j].visit = false;
			}
			int tmp = dfs(arr,arr[i].n) ;
			temp[arr[i].n] = tmp;
			count++;
		}
		
		for(int i=0;i<count;i++)
		System.out.println(temp[i]);
		
		System.out.println(count);
		
		
	}
}
