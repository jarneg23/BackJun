import java.util.PriorityQueue;

class priorityQueue {

	class pair implements Comparable<pair>
	{
		int u;
		int v;
		pair(int a, int b)
		{
			u = a;
			v = b;
		}
		
		
		//오름차순으로 정렬
		// return 1 = 앞쪽에 삽입
		// return -1 = 뒤쪽에 삽
	
		 @Override
		    public int compareTo(pair target) {
		        if (this.u > target.u) {
		            return 1;
		        } else if (this.u < target.u) {
		            return -1;
		        }
		        return 0;
		    }
	}
	
	PriorityQueue<pair> pq = new PriorityQueue<pair>();
	
	void add(pair item ) {
		pq.offer(item);
	}
	
}
