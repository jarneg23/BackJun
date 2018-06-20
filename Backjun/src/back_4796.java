import java.util.Scanner;


public class back_4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int L=-1;
		int P=-1;
		int V=-1;
		int count = 0;
  		L = sc.nextInt();
		P = sc.nextInt();
		V = sc.nextInt();
		while(!(L==0&&P==0&&V==0))
		{
		count++;
		int result;
		if((V%P)>L) { result = ((V/P)*L) + L ;}
		else {result = ((V/P)*L) + (V%P);}
		 
		System.out.printf("Case %d: %d\n",count,result);
        
        L = sc.nextInt();
		P = sc.nextInt();
		V = sc.nextInt();
		}
		
	}

}

