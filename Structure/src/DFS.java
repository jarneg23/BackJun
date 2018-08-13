import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DFS {


	List<DFS> member = new ArrayList<DFS>();
	int value;

	DFS(int val){value = val;}
	
	void add(int item) {member.add(new DFS(item));}
	
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
