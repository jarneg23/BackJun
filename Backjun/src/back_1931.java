import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class back_1931 {

    public static void sortArray(int[][] arr)
    {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] arr1, int[] arr2) {
                if( ((Comparable)arr1[1]).compareTo(arr2[1]) < 0 )
                    return -1;
                else
                    return 1;
            }


        });
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
                //start[0], end[0] 배열은 arr[][] 의 첫번째 라인(시작시간)이다.
                //start[1], end[0] 배열은 arr[][] 의 두번째 라인(종료시간)이다.
                if(start[1]==end[1]){
                    //만약 비교하는 값의 종료시간이 같을 경우 시작시간으로 정렬한다.
                    return Integer.compare(start[0], end[0]);
                }
                //종료시간에 따라 정렬한다.
                return Integer.compare(start[1], end[1]);
            }
 
        });
        
		int end = -1;
		int count = 0;
		
		for(int i =0; i<N ; i++)
		{
			if(end <= arr[i][0])
			{
				end = arr[i][1];
				count ++;
			}
		}
		System.out.println(count);
	}

}

