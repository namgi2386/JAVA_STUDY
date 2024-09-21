package class8;

public class dog_test {
	public static void main(String[] args) {
		Dog d = new Dog("tom" , 10);
		System.out.println(d.name);
		System.out.println(d.age);
		
		// 내가 직접 생성자를 만들었기에
		// 이제는 컴파일러가 기본생성자를 만들어주지않음
		Dog d2 = new Dog();
		System.out.println(d2.name); //무명
		System.out.println(d2.age); // 0
		
		d.eat().drink();
	}
}
