import java.util.Scanner;

public class back_14504 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N = N + 1;
		int[] arr = new int[N];
		
		for(int i=1; i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		for(int i=0; i<M; i++)
		{
			int flag = sc.nextInt();
			if(flag ==1)
			{
				int l =sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
			
				int count = 0;
				for(int z=l;z<j+1;z++)
				{
					if(arr[z]>k) {count++;}
				}
				System.out.println(count);
			}
			else
			{
				arr[sc.nextInt()] = sc.nextInt();
			}
		}
		
	}
}

