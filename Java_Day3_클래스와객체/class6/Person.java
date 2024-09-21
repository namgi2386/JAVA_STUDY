package class6;


class Person {
	//맴버변수 (속성)
	String name;
	int age;
	String hobby;
	

	void info() {
		System.out.println("이름은 " + name+ " 이고 나이는 " +age+"세");
		System.out.println("취미는 "+hobby+" 입니다");
	}
	void study(int time) {
		System.out.println(time + "시간동안 공부하기");
	}
		//메서드 오버로딩
		// 파라미터의 타입 개수 순서가 달라야함
		
	void study(long time) {		
		System.out.println(time + "시간동안 공부하기");
	}
	void study(double time) {
		System.out.println(time + "시간동안 공부하기");		
	}
	void study(String time) {
		System.out.println(time + "시간동안 공부하기");		
	}
	void study(int time , String subject) {
		System.out.println(subject + "를" + time + "시간동안공부함");
	}
	void study(String subject, int time) {
		System.out.println(subject + "를" + time + "시간동안공부함");
	}
}
