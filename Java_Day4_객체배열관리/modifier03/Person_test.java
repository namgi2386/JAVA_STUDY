package modifier03;

public class Person_test {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setAge(30);
		System.out.println(p.getAge()); // 30
		
		p.setAge(-10); // 불가능 출력
		System.out.println(p.getAge());
		
	}
	
}
