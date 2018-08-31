import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair
{
	int x;
	int y;
	int depth;
	pair(int x, int y, int depth) {this.x = x; this.y = y; this.depth = depth;}
}

public class back_5427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt(); // 테스트 케이스
			Queue<pair> quf;
			Queue<pair> qup; 
			
			while(T-- > 0)
			{
				quf = new LinkedList<pair>();
				qup = new LinkedList<pair>();
				int n = sc.nextInt();
				int m = sc.nextInt();
				char[][] map = new char[m][n];
				int startX = 0, startY = 0;
				
				
				for(int i = 0; i<m; i++)
				{
					String arr = sc.next();
					for(int j = 0; j<n;j++)
					{
						char tmp = arr.charAt(j);
						map[i][j] = tmp;
						if(tmp == '*') {quf.offer(new pair(i,j,0));}
						else if(tmp == '@') {qup.offer(new pair(i,j,0));}	
					}
				}
				
				boolean flag = false;
				while(qup.size() > 0 || quf.size() > 0 )
				{
					int sz = quf.size();
					int szp = qup.size();
					for(int i = 0; i<sz; i++)
					{
						pair tmp = quf.poll();
						int X = tmp.x;
						int Y = tmp.y;
						if(X+1 < m &&( map[X+1][Y] =='.' || map[X+1][Y] =='@')) {map[X+1][Y] = '*'; quf.offer(new pair(X+1,Y,0));}
						if(Y+1 < n &&( map[X][Y+1] =='.' || map[X][Y+1] =='@')) {map[X][Y+1] = '*'; quf.offer(new pair(X,Y+1,0));}
						if(X-1 >=0 &&( map[X-1][Y] =='.' || map[X-1][Y] =='@')) {map[X-1][Y] = '*'; quf.offer(new pair(X-1,Y,0));}
						if(Y-1 >=0 &&( map[X][Y-1] =='.' || map[X][Y-1] =='@')) {map[X][Y-1] = '*'; quf.offer(new pair(X,Y-1,0));}
					}
					
					for(int i = 0; i < szp; i++)
					{
						pair tmp = qup.poll();
						int X = tmp.x;
						int Y = tmp.y;
						int DEPTH = tmp.depth;
						if(X == 0 || X == m-1 || Y == 0 || Y == n-1)
						{
							System.out.println(DEPTH+1);
							flag = true;
							break;
						}
						if(X+1 < m && map[X+1][Y] == '.') {map[X+1][Y] = '@'; qup.offer(new pair(X+1,Y,DEPTH+1));}
						if(Y+1 < n && map[X][Y+1] == '.') {map[X][Y+1] = '@'; qup.offer(new pair(X,Y+1,DEPTH+1));}
						if(X-1 >=0 && map[X-1][Y] == '.') {map[X-1][Y] = '@'; qup.offer(new pair(X-1,Y,DEPTH+1));}
						if(Y-1 >=0 && map[X][Y-1] == '.') {map[X][Y-1] = '@'; qup.offer(new pair(X,Y-1,DEPTH+1));}
					
					}
					if(flag == true) break;
						
					
				}
				
				if(flag == false)  System.out.println("IMPOSSIBLE");
				
			}
	}

}
