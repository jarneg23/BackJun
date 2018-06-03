import java.util.ArrayList;
import java.util.Scanner;

public class Back_1021 
{	   
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			ArrayList list = new ArrayList();
			
			int Size = sc.nextInt();
			int count = sc.nextInt();
			int[] order = new int[Size];
			int next = 1;
			int result = 0;
			for(int i = 0; i<Size; i++) { list.add(i+1); order[i]= 0;}
			for(int i = 0; i<count; i++) 
			{ 
				int cc = sc.nextInt();
				order[cc-1] = i+1; 
				}
			int ct = 6;
			
			while(next != count) 
			{
				System.out.println("next : "+ next);
				System.out.println("first : "+ list.get(0));
				switch(find(list,order,next))
				{
					case 0:
						System.out.println("remove : "+ list.get(0));		
						list.remove(0);
						next++;
						break;
					case 1:
						list.remove(0);
						break;
					case 2:
						list.add(list.size(), list.get(0));
						list.remove(0);
						result++;
						break;
					case 3:
						list.add(0,list.get(list.size()-1));
						list.remove(list.size()-1);
						result++;
						break;
				}
				ct--;
				if(ct==0)
				{
					break;
				}
			}
			System.out.print(result);
			
		}
		
		static int find(ArrayList arr, int[] temp , int pos)
		{
			System.out.println("pos : " + pos + " temp number : "+ temp[pos] + " arr number : " +(int)arr.get(0));
			int find_num = 0;
			for(int i=0; i< temp.length;i++)
			{
				if(temp[i]==pos) {find_num = i; break;}
			}
			int getN = (int)arr.get(0);
			if(getN == find_num) return 0;
			else if(temp[getN-1]==0) { return 1; }
			else
			{
				if(arr.indexOf(temp[pos]) > arr.size()/2) { return 3; }
				else { return 2; }
			}
			
		}
}

