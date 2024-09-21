package class6;

public class person_test {
	public static void main(String[] args) {
		// 1. 객체생성 
		// 2. '.' 연산자 사용
		Person p = new Person();
		
		
		// 묵시적형변환 가능. 즉 
		// 아래애들은 int로 변경이 가능하니까 
		// 사용가능
		p.study((short)2);
		p.study((byte)10);		
		p.study('a'); // char
		p.study(10);
		
		// 이건 불가능
		p.study(10L); // long
		p.study(10.3f); // float
		p.study(10.0); // double
		p.study("a"); //string
		p.study(10, "수학");
	}

}

