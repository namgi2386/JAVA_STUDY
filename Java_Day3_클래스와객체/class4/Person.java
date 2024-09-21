package class4;



// 클래스 생성 : class 키워드 이용
// class 클래스 이름 {}
class Person {
	//맴버변수 (속성)
	String name;
	int age;
	String hobby;
	
	//맴버메서드 (동작)
	//관련 데이터와 로직을 하나로 묶어서 사용
	//맴버메서드에서는 맴버변수를 자유롭게 사용가능
	void info() {
		System.out.println("이름은 " + name+ " 이고 나이는 " +age+"세");
		System.out.println("취미는 "+hobby+" 입니다");
	}
	public static void hello() {
		System.out.println("hello");
	}
	
}
