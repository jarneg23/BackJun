import java.util.Scanner;
public class back_11726 {
    static String Test;
    public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        cal(N);
  
    }
    public static void cal(int num)
    {
       int[] result = new int[num+1];
          if(num == 0){System.out.println(0);}
          else if(num == 1){System.out.println(1);}
          else if(num == 2){System.out.println(2);}
          else
          {
              result[0] = 0;
              result[1] = 1;
              result[2] = 2;
              
              for(int i=3;i<num+1;i++)
              {
                  result[i] = (result[i-2] + result[i-1]) % 10007; 
              }
              System.out.println(result[num]);
          }              
    }
}