import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.Stack;
public class back_5076 {

	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 String temp = sc.nextLine();
		 Stack stack = new Stack();
		 int start= 0;
		 int end = 0;
		 String split;
		 String tmp;
		while(!temp.equals("#"))
		{
		
		for(int i =0; i<temp.length();i++)
		{
			if(temp.charAt(i)=='<')
			{
				start = i;
			}
			else if(temp.charAt(i)=='>') 
			{
				end = i;
			//검정 나뭇잎 E3 과
				split = temp.substring(start+1, end);
				if(split.contains(" ")==true)
				{
					if(split.split(" ")[1].equals("/")== false)
					{
						split = split.split(" ")[0];	
					}else
					{
						split = split.split(" ")[1];
					}
				}
				
				if(!split.equals("/"))
				{
					if(stack.isEmpty()) 
					{
						stack.push(split);
					}
					else
					{
						tmp = (String)stack.peek();
						if(split.equals("/"+tmp)==true || tmp.equals("/"+split))
						{
							stack.pop();
						}else {
							stack.push(split);
						}			
					}
				}
				
			}
			
		}
		if(stack.isEmpty()) {System.out.println("legal");}
		else {System.out.println("illegal");}
		stack.clear();
		temp = sc.nextLine();
		}
		 
	 }
}
