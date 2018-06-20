import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back_3078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long count = 0;
		
		Queue[] queue = new Queue[21];
		for(int i=0;i<21;i++)
		{
			queue[i] = new LinkedList();
		}
		
		long result = 0;
		for(int i =0; i<N;i++)
		{
			count++;
			String temp = sc.next();
			
			if(queue[temp.length()].isEmpty())
			{queue[temp.length()].add(count);}
			else
			{
				long size = queue[temp.length()].size();
				while(size-->0)
				{
					
					long tt = (long)queue[temp.length()].peek();

					if(count-tt>K) 
					{
					 queue[temp.length()].poll();	
					}
                    else
					{
						result += queue[temp.length()].size();
						break;
					}
				}
				
				queue[temp.length()].add(count);
			}
		
		}
		
		System.out.print(result);
		
		
		
		
		
	}

}

