package modifier01;

public class Person {
	
	//---------------------------------------------------------------------//
	//private : 클래스 내에서만 접근가능
	private String name;
	private int age;
	
	public void info() {
		name = "imnamgi"; // 동일한 클래스 내 private한 name에 접근 가능
		System.out.printf("이름:  %s, 나이: %d\n", name,age );
	}
	//---------------------------------------------------------------------//
	//default : 동일 패키지 내에서만 접근가능
	String default_name;
	int default_age;
	
	public void info_default() {
		default_name = "imnamgi";  // 당연히 가능
		System.out.printf("이름:  %s, 나이: %d\n", default_name,default_age );
	}
	//---------------------------------------------------------------------//
	//protected : 외부 패키지라면 상속관계일때 접근가능
	protected String pro_name;
	protected int pro_age;
	
	public void pro_default() {
		pro_name = "imnamgi";  // 당연히 가능
		System.out.printf("이름:  %s, 나이: %d\n", pro_name,pro_age );
	}
	//---------------------------------------------------------------------//
	//public : 공개
	public String pub_name;
	public int pub_age;
	
	public void pub_default() {
		pro_name = "imnamgi";  // 당연히 가능
		System.out.printf("이름:  %s, 나이: %d\n", pub_name,pub_age );
	}
}
