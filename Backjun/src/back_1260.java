import java.util.Scanner;
public class back_1260 {
	static int[] result ;
	static int[] result2 ;
	static int count = 0;
	static int count2 = 0;
	static void DFS(int[][] line, int start)
	{
		for(int i = 1 ; i<line.length; i++)
		{
		  if(line[start][i] == 1)
		  {
			  for(int j=0; j<count; j++)
			  {
				  if(result[j]==i) {break;}
				  else
				  {
					  if(j==count-1)
					  {
						  result[count] = i;
						  count++;
						  DFS(line,i);
					  }
				  }
			  }
		  }
		}
	}
	static void BFS(int[][] line, int start)
	{
		for(int i = 1 ; i<line.length; i++)
		{
			 if(line[start][i] == 1)
			 	{ 
				  for(int j=0; j<count; j++)
				  {
					  if(result2[j]==i) {break;}
					  else
					  {
						  if(j==count-1)
						  {	
							 result2[count] = i; 
							 count++;							
						  }
					  }
				  }
			 	} 
		}
		while(count2 < result2.length-1)
		{
			count2++;
			BFS(line,result2[count2]);
			
		}
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N_l = sc.nextInt();
		int start = sc.nextInt();
		int[][] line = new int[N+1][N+1];
		result = new int[N];
		result2 = new int[N];
		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=N; j++) {line[i][j] = 0;}
		}
		while(N_l-->0)
		{
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			line[s][e] = 1;
			line[e][s] = 1;
		}
		result[count]= start;
		count++;
		DFS(line,start);
		for(int i=0; i<count;i++)
		{
			if(i==count-1) {			System.out.println(result[i]);}
			else 
			{
			System.out.print(result[i] + " ");
			}
		}
		
		
		count = 0;
		result2[count] = start;
		count++;
		
		BFS(line,start);
		for(int i=0; i<count;i++)
		{
			if(i==count-1) {			System.out.println(result2[i]);}
			else 
			{
			System.out.print(result2[i] + " ");
			}
		}
	}	
}