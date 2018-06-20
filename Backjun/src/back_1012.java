import java.util.Scanner;
public class back_1012 {
	
	static int directionX[] = { 0,0,-1,1 };
	static int directionY[] = { -1,1,0,0 };
	static int M;
	static int N;
	static int K;
	static int result = 0;
	static void dfs(int[][] temp, int x, int y) {
		temp[x][y] = 0;
		int value = 0;
        
		for (int i = 0; i < 4; i++)
		{
			if(x+directionX[i] <M && y+directionY[i] <N&&
               x+directionX[i] >=0 && y+directionY[i] >=0) 
            {
                value = temp[x + directionX[i]][y + directionY[i]];
    			if (value==1) dfs(temp,x + directionX[i], y + directionY[i]);
            }
		}
        
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 종류
		
		
		while(T-- >0)
		{
			M = sc.nextInt(); //가로 길
			N = sc.nextInt(); //세로 길
			K = sc.nextInt(); //배추의수
			result = 0;
			int data[][] = new int[M][N];	
			for(int i=0; i<M; i++)
			{
				for(int j=0; j<N; j++)
				{
					data[i][j] = 0;
				}
			}
			
			for(int i=0; i<K; i++)
			{
                int A = sc.nextInt();
                int B = sc.nextInt();
				data[A][B] = 1;
			}
			
			
			for(int i=0; i<M; i++)
			{
				for(int j=0; j<N; j++)
				{
					if(data[i][j] == 1)
					{
						result++;
						dfs(data,i,j);
					}
				}
			}
			
			System.out.printf("%d\n",result);
		}
		
		
	}

}

