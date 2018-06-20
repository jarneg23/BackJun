import java.util.ArrayList;
import java.util.List;

class Deck
{
	List deck;
	Deck()
	{
	 deck = new ArrayList();	
	}
	void push_front(int item)
	{
		deck.add(0,item);
	}
	void push_back(int item)
	{
		deck.add(item);
	}
	int pop_front()
	{
		if(deck.size()==0) {return -1;}
		int get = (int)deck.get(0);
		deck.remove(0);
		return get;
	}
	int pop_back()
	{
		if(deck.size()==0) {return -1;}
		int get = (int)deck.get(deck.size()-1);
		deck.remove(deck.size()-1);
		return get;
	}
	int size() {
		return deck.size();
	}
	int empty()
	{
		return (deck.size()==0) ? 1 : 0; 
	}
	void front()
	{
		if(deck.size()==0) System.out.println("-1");
		else
		{
		System.out.println(deck.get(0));	
		}
	}
	void back()
	{
		if(deck.size()==0) System.out.println("-1");
		else
		{
		System.out.println(deck.get(deck.size()-1));	
		}
	}
}