import java.util.Scanner;

public class back_1629 {

	static long mul(long X , long Y, long Z)
	{
		X %=Z;
		
		if(Y == 0) { return 1; }
		else if(Y%2==0)return mul(X*X,Y>>1,Z)%Z;
		else return X * mul(X*X,(Y-1)>>1,Z)%Z;
		
	}
	
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt();
		
		long B = sc.nextInt();
		
		long C = sc.nextInt();
		
		long result = mul(A,B,C);
		
		
		System.out.print(result);
		
	}
}

