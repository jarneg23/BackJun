import java.util.Scanner;
public class back_2839 
{
	 public static void main(String[] args) 
	 {
	      Scanner sc = new Scanner(System.in);
	      int N = Integer.parseInt(sc.nextLine());
	      int[] dp1 = new int[N+1];
	      if(N==3||N==5)
	      {
	    	  System.out.println(1);
	      }
	      else if(N<=5) {
	    	  System.out.println(-1);
	      }
	      else 
	      {
		      for(int i=0;i<6;i++) 
		      {
		    	  	dp1[i]=0;
		      }
		      	dp1[3]=1;
		      	dp1[5]=1;
		      
	    	  	for(int j=6;j<=N;j++)
	    	  	{
	    	  	if(dp1[j-3]==0 && dp1[j-5]==0)
	    	  	{dp1[j]=0;}
	    	  	else if(dp1[j-3]==0)
	    	  	{dp1[j]= dp1[j-5]+1;}
	    	  	else if(dp1[j-5]==0)
	    	  	{dp1[j]= dp1[j-3]+1;}
	    	  	else
	    	  	{
	    	  			if(dp1[j-3] <= dp1[j-5]) {dp1[j]=dp1[j-3]+1;}
	    	  			else {dp1[j] = dp1[j-5]+1;}
	    	  		}
	    	  	}
	    	  	  if(dp1[N]==0) {System.out.println(-1);}
	  	      else {System.out.println(dp1[N]);}	
	      }
	      
	  }
}