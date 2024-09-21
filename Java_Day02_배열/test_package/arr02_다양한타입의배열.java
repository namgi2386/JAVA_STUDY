package test_package;

import java.util.Arrays;

public class arr02_다양한타입의배열 {
	public static void main(String[] args) {
		int[] nums = {12,4,33,11,26};
		int[] nums2 = new int[5];
		int[] nums3 = new int[] {1,3,5,6};
		
		// index를 활용해야할때
		for(int i=0 ; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// for - each
		// read only 읽기만할때
		for(int naam : nums) {
			System.out.println(naam);
		}
		
		// 배열 확인하기
		System.out.println(Arrays.toString(nums));
		
	}
}
