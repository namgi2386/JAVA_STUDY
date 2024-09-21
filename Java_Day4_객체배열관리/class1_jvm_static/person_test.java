package class1_jvm_static;

public class person_test {
	public static void main(String[] args) {
		
		System.out.println(Person.pCount); 	// 100 
		
		Person p = new Person();
		System.out.println(Person.pCount); 	// 100
		System.out.println(p.pCount); 		// 100
		p.pCount = 200; // static 변수는 모든 인스턴스가 공유한다.
		System.out.println(Person.pCount); 	// 200
		System.out.println(p.pCount); 		// 200
		// p.pCount 이딴식으로 사용은 가능하나 
		// Person.pCount 이게 권장사항
		
	}
}
