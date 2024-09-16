package java02_variable;

public class var01_test {
	public static void main(String[] args) {
		
		//변수 선언
		int age;
		//변수 초기화
		int money = 10000;
		
		//형변환은 자료형을 바꾸는 것
		// 1. 묵시적형변환
			// 범위 작은곳 > 큰곳
		int n1 = 100; // 값100이 중점이 아닌 int 자료형이 핵심
		long n2 = n1; // n1을 n2로 형변환
					// 즉 int 를 long 으로 형변환
		// 2. 명시적형변환
			// 범위 큰곳 > 작은곳
		long n3 = 100;
		//int n4 = n3; // 이건 안됨 !!!!
		// 이럴때
		// 명시적형변환 사용
		int n4 = (int) n3;
		
		// literal 
		// 값을 소스코드상에 적어놓은것?
		// 데이터형에 따라서 값의 표기 방법이 다르다?
		// 100은 int형의 숫자 100을 의미함
		// 100L 은 long형의 숫자 100
		// 사실
		long n5 = 100; //여기서도 묵시적형변환으로 int100이다
		// 12.34 은 double 형으로 의미함
		// 12.34f 를 해줘야 float 형이다. 
		// "hello world" 은 string형의 문자열로 인식
		int n6 = 12345678901234; // 불가능
		long n7 = 12345678901234; // 불가능
		long n8 = 12345678901234L; // 가능
		
	}
}
