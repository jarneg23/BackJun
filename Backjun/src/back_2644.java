import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class node
{
	int parent;
	List<Integer> child;
	boolean flag;
	node(){parent = 0; child = new ArrayList<Integer>(); flag = false;}
}

class Search
{
	node[] items;
	Queue<Integer> que = new LinkedList<Integer>();
	Search(node[] item){items = item;}
	
	int calResult(int target1, int target2)
	{
		
		while(items[target1].child.size() >0)
		{
			int tmp = items[target1].child.get(0);
			if(tmp == target2) return 1;
			if(items[tmp].child.size() !=0)
			{
				que.offer(tmp);
				items[target1].child.remove(0);
			}
			else
			{
				items[target1].child.remove(0);
			}
		}
		
		while(que.size() >0)
		{
			int tmp = calResult(que.poll(),target2);
			if(tmp != 0) 
				{
				 	
				 	return tmp +1;
				}
		}
		
		return 0;
	}
	
}

public class back_2644 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 사람 수
		int 	target1 = sc.nextInt();
		int target2 = sc.nextInt();
		int m = sc.nextInt();//관계수
		node[] bfs = new node[n+1];
		
		for(int i=0; i<n+1; i++)
		{
			bfs[i] = new node();
		}
		
		for(int i=0; i<m; i++)
		{
			int parent = sc.nextInt();
			int child = sc.nextInt();
			if(parent != child)
			{
			bfs[child].parent = parent;
			bfs[parent].child.add(child);
			}
		}
		
		if(target1 == target2)
		{
			System.out.println(0);
			
		}else
		{
			Search _bfs = new Search(bfs);
			int result = 0;
			int count = 0;
			
			result = _bfs.calResult(target1, target2);
			
			while(result == 0 && bfs[target1].parent != 0 )
			{
				target1 = bfs[target1].parent;
				count++;
				
				result = _bfs.calResult(target1, target2);
			}
			
			
			if(result == 0) {System.out.println("-1");}
			else {
			System.out.println(result + count);
			}
		}
		
		
}

}
