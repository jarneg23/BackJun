import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class pair5
{
	int val;
	String str;
	pair5(int v , String c)
	{
		val = v;
		str = c;
	}
}

public class back_9019 {
	
	static int calculator(int value, char op)
	{
		int val = value;
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		switch(op)
		{
			case 'D':
				val *= 2;
				if(val >9999) val %= 10000;
				break;
			case 'S':
				val -= 1;
				if(val == 0) val = 9999;
				break;
			case 'L':
				d1 = val/1000;
				d2 = (val/100) % 10;
				d3 = (val/10) % 10;
				d4 = val % 10;
				
				val = ((d2 * 10 + d3) * 10 + d4) * 10 + d1;
				break;
			case 'R':
				d1 = val/1000;
				d2 = (val/100) % 10;
				d3 = (val/10) % 10;
				d4 = val % 10;
				val = ((d4 * 10 + d1) * 10 + d2) * 10 + d3;
				break;
		}
		return val;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<pair5> list;
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
            list = new LinkedList<pair5>();
			pair5 result = new pair5(0,"");
			list.offer(new pair5(A,""));
			
			while(true)
			{
				pair5 tmp = list.poll();
                int V = calculator(tmp.val,'D');
                if(V == B) {result = tmp; result.str += "D"; break; }
                else {list.offer(new pair5(V,tmp.str+"D"));}
                
                V = calculator(tmp.val,'S');
                if(V == B) {result = tmp; result.str += "S"; break; }
                else {list.offer(new pair5(V,tmp.str+"S"));}
                
                V = calculator(tmp.val,'L');
                if(V == B) {result = tmp; result.str += "L"; break; }
                else {list.offer(new pair5(V,tmp.str+"L"));}
                
                V = calculator(tmp.val,'R');
                if(V == B) {result = tmp; result.str += "R"; break; }
                else {list.offer(new pair5(V,tmp.str+"R"));}
                
			}
			
			System.out.println(result.str);

		}
		
	}

}
