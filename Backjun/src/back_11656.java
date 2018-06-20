import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SortOrder;


public class back_11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] temp = new String[S.length()];
		
		for(int i=0; i<S.length();i++)
		{
			temp[i] = S.substring(i);
		}
		
		Arrays.sort(temp);
		
		for(int i=0; i<S.length();i++)
		{
			System.out.println(temp[i]);
		}
		
		
		
	}

}

