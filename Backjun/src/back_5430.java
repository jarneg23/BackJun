import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class back_5430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
	
		while(T-->0)
		{
			boolean reverse = false; 
			Deque<Integer> dc = new ArrayDeque<Integer>();
			String str = sc.next();
			int num = sc.nextInt();
			String arr = sc.next(); 
		
			if(num==0) {}
			else {
				arr= arr.substring(1,arr.length()-1);
				String[] tem = arr.split(",");
				for(int i=0;i<tem.length;i++)
				{
						dc.push(Integer.parseInt(tem[i]));
				}
			}
			// N = 100000
			
			int c = 0;
			String result ="[";
			//100000
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='R') 
				{
					reverse = !reverse ;
				}
				else if(str.charAt(i)=='D') 
				{
					if(dc.size()==0) 
					{
						result = "ERROR";
						break;
					}
					else 
					{
						if(reverse) { dc.getFirst(); dc.remove();}
						else {dc.getLast(); dc.removeLast();}
					}
				}
			}

			if(!result.equals("ERROR")) {
			while(dc.size()>0)
			{
				if(c==0) 
				{
					if(reverse) {  result += dc.getFirst(); dc.remove();}
					else { result += dc.getLast(); dc.removeLast();}
					c++;
				}
				else {
					result+= ",";
					if(reverse) {  result += dc.getFirst(); dc.remove();}
					else { result += dc.getLast(); dc.removeLast();}
				}
			}
			 result+="]";}
			
			System.out.println(result);
		}

}
}