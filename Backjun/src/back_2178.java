import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair2
{
	int x;
	int y;
	int depth;
	pair2(int x,int y, int depth){
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
}

public class back_2178 {


	public static void main(String[] args) {

		Queue<pair2> qu = new LinkedList<pair2>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] maze = new int[n][m];
		boolean[][] result = new boolean[n][m];
		
		for(int i=0;i<n;i++)
		{
			String value = sc.next();
			for(int j=0; j<m;j++)
			{
				
				maze[i][j] = value.charAt(j) - '0';
				result[i][j] = false;
			}
		}
		
		
		qu.offer(new pair2(0,0,0));
		result[0][0] = true;
	
		while(qu.size()>0)
		{
		
			pair2 tmp = qu.poll();
			if(tmp.x == n-1 && tmp.y == m-1)
			{
				System.out.println(tmp.depth+1);
				break;
			}
			
			if(tmp.x+1 < n && maze[tmp.x+1][tmp.y] == 1 && result[tmp.x+1][tmp.y] == false)
			{
				//System.out.println("x : " + (tmp.x+1) + " y: " + tmp.y);
					qu.offer(new pair2(tmp.x+1,tmp.y,tmp.depth+1));
					result[tmp.x+1][tmp.y]=true;
				
			}
			
			if(tmp.y+1 < m && maze[tmp.x][tmp.y+1] == 1 && result[tmp.x][tmp.y+1] == false)
			{
				//System.out.println("x : " + tmp.x + " y: " + (tmp.y+1));
					qu.offer(new pair2(tmp.x,tmp.y+1,tmp.depth+1));
					result[tmp.x][tmp.y+1]=true;
			}
			
			if(tmp.x-1 >= 0 && maze[tmp.x-1][tmp.y] == 1 && result[tmp.x-1][tmp.y] == false)
			{
				//System.out.println("x : " + (tmp.x-1) + " y: " + tmp.y);
					qu.offer(new pair2(tmp.x-1,tmp.y,tmp.depth+1));
					result[tmp.x-1][tmp.y]=true;
			}
			
			if(tmp.y-1 >= 0 && maze[tmp.x][tmp.y-1] == 1 && result[tmp.x][tmp.y-1] == false)
			{
				//System.out.println("x : " + tmp.x + " y: " + (tmp.y-1));
					qu.offer(new pair2(tmp.x,tmp.y-1,tmp.depth+1));
					result[tmp.x][tmp.y-1]=true;
			}
			
		}
		
		
		
	}

}
