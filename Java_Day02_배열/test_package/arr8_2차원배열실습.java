package test_package;

public class arr8_2차원배열실습 {
	public static void main(String[] args) {
		int[][] arr = {
				{2,3,1,5,7},
				{8,10,4,32,2},
				{8,5,2,4,5},
				{1,5,7,9,4},
				{5,33,57,12,3},
		};
		int sum =0;
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%3!=0)
					continue;
				cnt++;
				sum += arr[i][j];
				
			}
		}
		System.out.println(sum);
		System.out.println(cnt);
	}
}
