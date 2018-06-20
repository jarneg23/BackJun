import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class deck
{
	List Deck;
	deck()
	{
	 Deck = new ArrayList();	
	}
	void push_front(int item)
	{
		Deck.add(0,item);
	}
	void push_back(int item)
	{
		Deck.add(item);
	}
	int pop_front()
	{
		if(Deck.size()==0) {return -1;}
		int get = (int)Deck.get(0);
		Deck.remove(0);
		return get;
	}
	int pop_back()
	{
		if(Deck.size()==0) {return -1;}
		int get = (int)Deck.get(Deck.size()-1);
		Deck.remove(Deck.size()-1);
		return get;
	}
	int size() {
		return Deck.size();
	}
	int empty()
	{
		return (Deck.size()==0) ? 1 : 0; 
	}
	void front()
	{
		if(Deck.size()==0) System.out.println("-1");
		else
		{
		System.out.println(Deck.get(0));	
		}
	}
	void back()
	{
		if(Deck.size()==0) System.out.println("-1");
		else
		{
		System.out.println(Deck.get(Deck.size()-1));	
		}
	}
}
public class back_10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		deck dc = new deck();
		for(int i=0;i<N+1;i++)
		{
			String[] s = sc.nextLine().split(" ");
			if(s[0].equals("push_back")==true) {dc.push_back(Integer.parseInt(s[1]));}
			else if(s[0].equals("push_front")==true) {dc.push_front(Integer.parseInt(s[1]));}
			else if(s[0].equals("front")==true) {dc.front();}
			else if(s[0].equals("back")==true) {dc.back();}
			else if(s[0].equals("size")==true) {System.out.println(dc.size());}
			else if(s[0].equals("empty")==true) {System.out.println(dc.empty());}
			else if(s[0].equals("pop_front")==true) {System.out.println(dc.pop_front());}
			else if(s[0].equals("pop_back")==true) {System.out.println(dc.pop_back());}
			
		}
	}

}
