import java.util.Arrays;
import java.util.Scanner;

public class back_11047{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N, K;
		N = sc.nextInt();
		K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i< N; i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i= N-1; i >= 0; i--)
		{
			if(arr[i] <= K)
			{
				count += ( K / arr[i]);
				K = K%arr[i];
				
			}
		}
		System.out.println(count);
	}

}

