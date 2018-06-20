import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class back_1449 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] dis = new int[N];
		for(int i=0; i<N;i++)
		{
			dis[i] = sc.nextInt();
		}
		Arrays.sort(dis);
		int sum = dis[0];
		int count = 0;
		for(int i=0; i<N; i++)
		{
			if(dis[i] <= sum + L - 1)
			{
				
			}
			else
			{
				sum = dis[i];
				count ++;
			}
		}
		System.out.println(count+1);
	}

}

