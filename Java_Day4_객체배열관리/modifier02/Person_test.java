package modifier02;

import modifier01.Person;


public class Person_test {
	public static void main(String[] args) {
		// 다른 패키지에 있는 다른 클래스
		Person p = new Person();
//		p.name			// 불가능
//		p.default_name  // 불가능
//		p.pro_name 		// 불가능
		p.pub_name = "good"; // 가능
	}
}
