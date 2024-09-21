package class8;

public class Dog {
	String name;
	int age;
	
	
	Dog (String name , int age){
		//this. 으ㅡ로 구분
		// 나의.name은 입력받은 name으로 한다
		this.name = name;
		this.age = age;
	}
	//이름만 입력받음
	Dog(String name){
		//다른생성자 호출하기
		// 야! 여기 이름밖에 안들어왔어! 도와줘
		this(name,5);
		// 제약사항 : 반드시 첫줄에 위치
	}
	//나이만 입력받음
	Dog(int age){
		this("무명",age);
	}
	Dog(){
		this("무명",0);
	}
	Dog eat() {
		System.out.println(name +"이 사료먹기...");
		return this;
	}
	void drink() {
		System.out.println("그리고 물마시기");
	}
}
