import java.util.Scanner;
import java.util.Stack;
public class back_2841 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack[] stacks = new Stack[6];
	
		for(int i=0; i<6; i++)
		{
			stacks[i] = new Stack<Integer>();
		}
		int N = sc.nextInt();
		int P = sc.nextInt();
		int result = 0;
		for(int i=0;i<N;i++)
		{
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			if(stacks[a].isEmpty())
			{
				stacks[a].push(b);
				result++;
				
			}
			else
			{
				while(!stacks[a].isEmpty())
				{
					int c = (int)stacks[a].peek();
					if(b>c){
						result++;
						stacks[a].push(b);
						break;
					}else if(b<c)
					{
						stacks[a].pop();
						result++;
						if(stacks[a].isEmpty()) 
						{
							stacks[a].push(b);
							result++;
							break;
						}
					}else 
					{
						break;
					}
					
				}
			}	
		}
		System.out.print(result);
	}

}
