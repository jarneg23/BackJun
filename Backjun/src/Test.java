import java.util.ArrayList;
import java.util.List;

class DFS {


	List<DFS> member = new ArrayList<DFS>();
	int value;

	DFS(int val){value = val;}
	
	void add(int item) {member.add(new DFS(item));}
	void add(int dest, int item)
	{
		if(value == dest) {add(item); return;}
		else
		{

			for(int i=0; i<member.size(); i++)
			{
				member.get(i).add(dest,item);
			}	
			
		}
	}
	
	boolean dfs(int _i)
	{
		if(value == _i) {return true;}
		else
		{
			for(int i=0; i<member.size(); i++)
			{
				if(member.get(i).dfs(_i)){return true;};
			}
			return false;
		}
	}
}



public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS df = new DFS(1);
		
		df.add(2);
		df.add(3);
		df.add(2,4);
		df.add(3,5);
		df.add(3,6);
		df.add(4,3);
		
		if(df.dfs(6)) {System.out.println("6");}
		if(df.dfs(5)) {System.out.println("5");}
		if(df.dfs(7)) {System.out.println("7");}
		else
		{
			System.out.println("no 7");
		}
	}
	

}
