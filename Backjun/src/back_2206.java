import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class pair4
{
	int x;
	int y;
	int depth;
	int count;
	pair4(int x, int y, int depth, int count) {this.x = x; this.y = y; this.depth = depth; this.count = count;}
}

public class back_2206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<pair4> qu = new LinkedList<pair4>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N][M];
		for(int i=0;i<N;i++)
		{
			String tmp = sc.next();
			for(int j=0; j<M; j++)
			{
				map[i][j] = tmp.charAt(j)-'0';
			}
		}
		qu.offer(new pair4(0,0,1,0));
		
		while(true)
		{
			int size = qu.size();
			for(int i =0 ; i< size ;i++)
			{
				pair4 tmp = qu.poll();
				int X = tmp.x;
				int Y = tmp.y;
				int Depth = tmp.depth;
				int count = tmp.count;
				
				if(X == N-1 && Y == M-1)
				{
					System.out.println(Depth);
					return;
				}
				
				if(X+1 < N && (map[X+1][Y] == 0)) 
				{
					if(count !=1) {map[X+1][Y] = 4;}else {map[X+1][Y] = 3;}
					
					qu.offer(new pair4(X+1,Y,Depth+1,count));
				}
				if(Y+1 < M && (map[X][Y+1] == 0)) 
				{
					if(count !=1) {map[X][Y+1] = 4;} else {map[X][Y+1] = 3;}
					qu.offer(new pair4(X,Y+1,Depth+1,count));
				}
				if(X-1 >=0 && (map[X-1][Y] == 0)) 
				{
					if(count !=1){map[X-1][Y] = 4;} else {map[X-1][Y] = 3;}
					qu.offer(new pair4(X-1,Y,Depth+1,count));
				}
				if(Y-1 >=0 && (map[X][Y-1] == 0)) 
				{
					if(count !=1) {map[X][Y-1] = 4;}else {map[X][Y-1] = 3;} 
					qu.offer(new pair4(X,Y-1,Depth+1,count));
				}
				
				if(X+1 < N && (map[X+1][Y] == 3)&& count ==0) {map[X+1][Y] = 5; qu.offer(new pair4(X+1,Y,Depth+1,count));}
				if(Y+1 < M && (map[X][Y+1] == 3)&& count ==0) {map[X][Y+1] = 5; qu.offer(new pair4(X,Y+1,Depth+1,count));}
				if(X-1 >=0 && (map[X-1][Y] == 3)&& count ==0) {map[X-1][Y] = 5; qu.offer(new pair4(X-1,Y,Depth+1,count));}
				if(Y-1 >=0 && (map[X][Y-1] == 3)&& count ==0) {map[X][Y-1] = 5; qu.offer(new pair4(X,Y-1,Depth+1,count));}
				
				if(X+1 < N && map[X+1][Y] == 1 && count == 0) { qu.offer(new pair4(X+1,Y,Depth+1,count+1));}
				if(Y+1 < M && map[X][Y+1] == 1 && count == 0) { qu.offer(new pair4(X,Y+1,Depth+1,count+1));}
				if(X-1 >=0 && map[X-1][Y] == 1 && count == 0) { qu.offer(new pair4(X-1,Y,Depth+1,count+1));}
				if(Y-1 >=0 && map[X][Y-1] == 1 && count == 0) { qu.offer(new pair4(X,Y-1,Depth+1,count+1));}
				
				//System.out.println("X: "+X +" Y: "+ Y);
			}
			
			if(qu.size() == 0)
			{
				break;
			}
		}
		System.out.println("-1");
	}

}
