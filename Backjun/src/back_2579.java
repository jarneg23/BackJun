import java.util.Scanner;
public class back_2579 {
	public static int max(int a, int b) 
	{
		if(a>=b) return a;
		return b;
	}
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N][3];
		int[] stair = new int[N];
		
		for(int i=0; i<N;i++) { stair[i] = sc.nextInt(); }
		
		arr[0][1] = stair[0];
		arr[0][2] = stair[0];
		arr[1][1] = stair[1];
		arr[1][2] = stair[0]+stair[1];
		
		for(int i=2; i<N;i++)
		{
			  	arr[i][2] = arr[i-1][1]+stair[i];
			  	arr[i][1] = max(arr[i-2][1],arr[i-2][2]) + stair[i];
		}
		
		System.out.println(max(arr[N-1][1],arr[N-1][2]));
	}	
}