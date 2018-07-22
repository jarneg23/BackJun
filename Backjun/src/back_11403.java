import java.util.Scanner;
public class back_11403 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] list = new int[N][N];
		int[][] result = new int[N][N];
		
		for(int i=0; i<N;i++)
			for(int j=0; j<N;j++)
			{
				list[i][j] = sc.nextInt();
				result[i][j] = 0;
			}
		boolean flag =false;
		int start=0;
		int end = 0;
		for(int i=0; i<N;i++)
			for(int j=0; j<N;j++)
			{
				start =i;
				end = j;
				if(list[start][end] == 1) {
					flag = true;
					while(flag)
					{
						result[start][end]=1;
						int c = 0;
						for(int k = 0;k<N;k++)
						{
							if(list[end][k]==1)
							{
								end = k;
								c = 1;
								break;
							}
						}
						System.out.println(j +" "+c);
						if(c==0)
						{
							flag = false;
						} 
						
						
						
					}
				}
				else
				{
					
				}
			}
		
		
		for(int i=0; i<N;i++)
			for(int j=0; j<N;j++)
			{
				System.out.print(result[i][j]+" ");
			}
	}

}
