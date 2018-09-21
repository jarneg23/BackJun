import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair3
{
	int x;
	int y;
	int depth;
	pair3(int x, int y, int depth) {this.x = x; this.y = y; this.depth = depth;}
}

public class back_3055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<pair3> quB = new LinkedList<pair3>();
		Queue<pair3> quW = new LinkedList<pair3>();;
		char[][] map = new char[N][M];
		
		int DestX = 0;
		int DestY = 0;
		for(int i=0;i<N;i++)
		{
			String temp = sc.next();
			for(int j=0; j<M; j++)
			{
				char tmp = temp.charAt(j);
				map[i][j] = tmp;
				//if(tmp == 'D') {DestX = i; DestY = j;}
				if(tmp == '*') {quW.offer(new pair3(i,j,0));}
				else if(tmp == 'S') {quB.offer(new pair3(i,j,0));}
			}
		}
		
		while(true)
		{
			int sizeW = quW.size();
			int sizeB = quB.size();
			
			for(int i=0; i<sizeW;i++)
			{
				pair3 tmp = quW.poll();
				int X = tmp.x;
				int Y = tmp.y;
				if(X+1 < N &&( map[X+1][Y] =='.' || map[X+1][Y] =='S')) {map[X+1][Y] = '*'; quW.offer(new pair3(X+1,Y,0));}
				if(Y+1 < M &&( map[X][Y+1] =='.' || map[X][Y+1] =='S')) {map[X][Y+1] = '*'; quW.offer(new pair3(X,Y+1,0));}
				if(X-1 >=0 &&( map[X-1][Y] =='.' || map[X-1][Y] =='S')) {map[X-1][Y] = '*'; quW.offer(new pair3(X-1,Y,0));}
				if(Y-1 >=0 &&( map[X][Y-1] =='.' || map[X][Y-1] =='S')) {map[X][Y-1] = '*'; quW.offer(new pair3(X,Y-1,0));}
			}
			
			for(int i=0; i<sizeB;i++)
			{
				pair3 tmp = quB.poll();
				int X = tmp.x;
				int Y = tmp.y;
				int DEPTH = tmp.depth;
				
				if(X+1 < N && map[X+1][Y] == '.') {map[X+1][Y] = 'S'; quB.offer(new pair3(X+1,Y,DEPTH+1));}
				if(Y+1 < M && map[X][Y+1] == '.') {map[X][Y+1] = 'S'; quB.offer(new pair3(X,Y+1,DEPTH+1));}
				if(X-1 >=0 && map[X-1][Y] == '.') {map[X-1][Y] = 'S'; quB.offer(new pair3(X-1,Y,DEPTH+1));}
				if(Y-1 >=0 && map[X][Y-1] == '.') {map[X][Y-1] = 'S'; quB.offer(new pair3(X,Y-1,DEPTH+1));}
				
				if(X+1 < N && map[X+1][Y] == 'D') {System.out.println(DEPTH+1); return;}
				if(Y+1 < M && map[X][Y+1] == 'D') {System.out.println(DEPTH+1); return;}
				if(X-1 >=0 && map[X-1][Y] == 'D') {System.out.println(DEPTH+1); return;}
				if(Y-1 >=0 && map[X][Y-1] == 'D') {System.out.println(DEPTH+1); return;}
				
			}
			
			if(quW.size() == 0 && quB.size() == 0) {System.out.println("KAKTUS"); return;}
		}
		

	}

}
