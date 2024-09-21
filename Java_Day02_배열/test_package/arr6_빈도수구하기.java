package test_package;


import java.util.Arrays;

public class arr6_빈도수구하기 {
	public static void main(String[] args) {
		int[] arr = {3,7,2,5,7,7,9,2,8,1,1,5,3};
		
		int[] cntarr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			cntarr[arr[i]]++;
		}
	System.out.println(Arrays.toString(cntarr));
	for(int i=1;i<cntarr.length; i++) {
		System.out.printf("%d : %d개\n",i,cntarr[i]);
	}
	}
}
