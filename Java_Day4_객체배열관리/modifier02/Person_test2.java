package modifier02;

import modifier01.Person;

// 상속 받은 상태 ( person 으로부터 persontest2가 상속 받음
public class Person_test2 extends Person{
	public static void main(String[] args) {
		// 다른 패키지에 있는 다른 클래스
		Person p = new Person();
//		p.name			// 불가능
//		p.default_name  // 불가능
//		p.pro_name 		// 불가능
		
		// 상속받은 person_test2 에서 생성한 p2는 protected한 변수 pro_name 을 사용가능하다.
		Person_test2 p2 = new Person_test2();
		p2.pro_name = "ohho"; // 가능
	}
}
