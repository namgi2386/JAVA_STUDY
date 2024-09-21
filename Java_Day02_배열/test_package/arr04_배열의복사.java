package test_package;

import java.util.Arrays;

public class arr04_배열의복사 {
	public static void main(String[] args) {
		int[] nums = {1,5,6,2,3};
		//빈배열 만들기
		int[] tmp = new int[nums.length*2];
		for(int i=0; i <nums.length; i++) { 
			tmp[i] = nums[i]; // 하나씩 옮기기
		}
		System.out.println(Arrays.toString(tmp));
		// [1, 5, 6, 2, 3, 0, 0, 0, 0, 0]
		
		// Arrays.copyOf(원본배열 , 새로운 배열의 크기 ) 
		int[] tmp2 = Arrays.copyOf(nums, nums.length*2);
		System.out.println(Arrays.toString(tmp2));
		
		// arrays.copyofrange(원본배열 , 시작점 , 끝인덱스 ) 
		int[] tmp3 = Arrays.copyOfRange(nums, 3, nums.length*2);
		System.out.println(Arrays.toString(tmp3)); // [2, 3, 0, 0, 0, 0, 0]

		
		//system.arraycopy(원본배열, 원본배열시작점 , 복사배열 , 복사배열시작점, 복사할갯수)
		int[] tmp4 = new int[nums.length*2];
		System.arraycopy(nums, 0, tmp4, 2, nums.length);
		System.out.println(Arrays.toString(tmp4)); // [0, 0, 1, 5, 6, 2, 3, 0, 0, 0]
		System.arraycopy(nums, 3, tmp4, 1, nums.length-3);
		System.out.println(Arrays.toString(tmp4)); // [0, 2, 3, 5, 6, 2, 3, 0, 0, 0]
	}
}
