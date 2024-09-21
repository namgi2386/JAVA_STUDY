package test_package;

import java.util.Arrays;

public class arr7_2차원배열 {
	public static void main(String[] args) {
		int[][] arr1;
		int[][] arr2 = new int[3][4];
		
		//다차원 배열 출력하기
		System.out.println(Arrays.deepToString(arr2));
		//[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
		
		int[][] arr3 = new int[3][];
		System.out.println(Arrays.deepToString(arr3));
		// [null, null, null]
		arr3[0] = new int[1];
		arr3[1] = new int[3];
		arr3[2] = new int[4];
		System.out.println(Arrays.deepToString(arr3));
		// [[0], [0, 0, 0], [0, 0, 0, 0]]
	}
}
