package class1_jvm_static;

public class Person {
	
	//static
	// class 설계도에 들어있는 변수 (인스턴스생성과 무관)
	// person.java가 저장되자마자 메서드영역에 저장됨
	// 사용시, Person.pCount 로 사용가능
	static int pCount = 100;
	
	
	static int pSum = 0;
	static { // static 블록으로 나중에 값 할당
		pSum = 200;
	}
	
	// non-static
	// 사용시, namgi.age 으로 사용가능
	// this는 각각의 인스턴스가 자기자신을 가르키는 참조방법
	String name;
	int age;
	String hobby;
	
	
	// static 메서드 (설계도)
	public static void main(String[] args) {
		// static 에서는 non-static 접근 불가
		pCount = 200; 		// 가능
//		name = "namgi"; 	// 불가능
		
	}
	//클래스 내 non-static 메서드
	public void info() {
		pCount = 300;		//가능
		name = "namgi";		//가능
	}
}
