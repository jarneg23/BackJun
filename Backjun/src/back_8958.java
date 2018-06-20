import java.util.Scanner;
public class back_8958 {
    static String Test;
    public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-->0)
        {
            Test = sc.next();
            cal(Test);
        }
    }
    public static void cal(String ts)
    {
        int length = ts.length();
        int count = 1;
        int result = 0;
        for(int i=0; i<length;i++)
        {
            if(ts.charAt(i)=='O'){result += count; count++;}
            else if(ts.charAt(i) == 'X'){count=1;}
        }
        System.out.println(result);
    }
}