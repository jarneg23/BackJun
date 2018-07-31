import java.util.Scanner;
import java.util.Stack;

public class back_1918 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String notation = sc.nextLine();
		Stack<Character> st2 = new Stack<Character>();
		
		for(int i=0; i<notation.length(); i++)
		{
			char temp = notation.charAt(i);
			switch(temp)
			{
			case '+':
			case '-':
				if(st2.isEmpty()) {st2.push(temp);}
				else {
					while(st2.size()!=0)
					{
						char temp2 = st2.peek();
						if( temp2 == '(' || 
							st2.isEmpty()
							)
						{
							break;
						}
						else{  System.out.print(st2.pop());  }
					}
					st2.push(temp);
				}
				break;
			case '*':
			case '/':
				if(st2.isEmpty()) {st2.push(temp);}
				else
				{
					while(st2.size()!=0)
					{
						char temp2 = st2.peek();
						if( temp2 == '(' || 
							st2.isEmpty()||
							temp2 == '+' ||
							temp2 == '-')
						{
							break;
						}
						else{  System.out.print(st2.pop());}
					}
					st2.push(temp);
				}
				break;
			case '(':
				st2.add(temp);
				break;
			case ')':
				while(st2.size()!=0)
				{
					char temp2 = st2.peek();
					if(temp2 == '(')
					{
						st2.pop();
						break;
					}
					else
					{
						System.out.print(st2.pop());
					}
				}
				break;
			default:
				System.out.print(temp);
			}
		}
		if(st2.size() !=0)
		{
			while(st2.size()!=0) System.out.print(st2.pop());
		}
		
		
	}

}
