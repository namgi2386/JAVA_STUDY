package test_package;

public class arr05_최대최소합평균 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,5,4};
		// 최대 최소 합 평균
		
		
		int max_num = nums[0];
		int min_num = nums[0];
		int sum_num = 0;
		
		for(int i =0 ; i<nums.length; i++ ) {
			sum_num += nums[i];
			if(nums[i] > max_num) {
				max_num = nums[i];
			}
			if(nums[i] < min_num) {
				min_num = nums[i];
			}
		}
		double ave_num = (double)sum_num / nums.length ;
		
		System.out.println(max_num);
		System.out.println(min_num);
		System.out.println(sum_num);
		System.out.printf("%.2f" , ave_num);
	}
}
