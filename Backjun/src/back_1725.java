import java.util.Scanner;
import java.util.Stack;

public class back_1725 {
	
	public static void main(String[] args) {
	
		class pair
		{
			long height;
			int num;
		}
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long max = 0;
		
		Stack<pair> st = new Stack<pair>();
		
		for(int i=0; i<N; i++)
		{
			pair p = new pair();
			p.height = sc.nextLong();
			p.num = i+1;
			while(!st.empty() && st.peek().height > p.height)
			{
				
				pair tmp = st.pop();
				int width =  i;
				if(!st.empty()){width -= st.peek().num;}
				long ar = tmp.height * width;
				max = max <= ar ? ar : max;
			}
			st.push(p);
		}
		
		
		while(!st.empty())
		{
			
			pair tmp = st.pop();
			int width = N;
			if(!st.empty()){width -= st.peek().num;}
			long ar = tmp.height * width;
			max = max <= ar ? ar : max;
		}
		
		System.out.print(max);
		
	}

}
