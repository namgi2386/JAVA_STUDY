package modifier03;

public class Person {
	
	//---------------------------------------------------------------------//
	//private : 클래스 내에서만 접근가능
	private String name;
	private int age;
	
	
	
	//접근자 getter
	public int getAge() {
		return age;
	}
	
	//설정자 setter
	public void setAge(int age) {
		if (age<0) {
			System.out.println("불가능");
			return;
		}
		this.age = age;
	}
}
