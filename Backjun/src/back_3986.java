import java.util.Scanner;
import java.util.Stack;

public class back_3986 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack stacks = new Stack();
		int N = sc.nextInt();
		int result =0;
		for(int i=0; i<N; i++)
		{
			
			String value = sc.next();
			for(int j=0; j<value.length();j++)
			{
				if(stacks.isEmpty()) 
				{
					stacks.push(value.charAt(j));
				}
				else
				{
					if(value.charAt(j) == (char)stacks.peek())
					{
						stacks.pop();
					}else
					{
						stacks.push(value.charAt(j));
					}
				}	
			}
			if(stacks.isEmpty()) { result++; }
			else
			{
				stacks.clear();
			}
			
		}
		System.out.print(result);
	}

}
