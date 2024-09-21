
public class array01_배열의생성과선언 {
	public static void main(String[] args) {
		//배열의 선언
		int[] arr1; // 권장사항
		int arr2[];
		//여기까지는 배열 실제로 만든게 아님 (변수만만듬)
		
		//배열의 생성
		int[] arr3 = new int[5];

		int[] arr4 = new int[] {1,2,3,4};

		int[] arr5 = {1,2,3,4,5};
		
		
		arr3 = new int[10];
		arr3 = new int[] {1,2,3,4,5};
//		arr3 = {1,2,3,4};
		// 재할당할때는 이렇게 사용할 수 없음
		
		arr3[4] = 10;
		arr3[5] = 20;
//		arr3[10] = 30; //실행전에는 알수없는 런터임에러 (index에러)
		
		//이클립스에서 소스코드를 저장할 때
		// 저장하는 순간에 컴파일 하는데, 컴파일할때는 문제가 없어서 
		// 빨간줄 없지만 실행할 때 에러나옴 
 	}
}
