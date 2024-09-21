package class4;

public class person_test {
	public static void main(String[] args) {
		//클래스를 가지고 객체를 생성
		// 클래스이름 객체의변수이름 = new 클래스이름();
		// . 연산자 ( 이 객체가 가지고있는 속성에 값 넣기 )
		
		
		//메서드 호출
		Person yang = new Person();
		yang.name = "namgi";
		yang.age = 40;
		yang.hobby = "youtube";
		
		yang.info();
		
		Person fong = new Person();
		fong.name = "kim";
		fong.age = 20;
		fong.hobby = "gaming";
		
		fong.info();
		
		//클래스 속 static 함수 그대로 호출
		Person.hello();
		 
	}

}

