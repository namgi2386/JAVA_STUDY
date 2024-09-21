package class3;

import java.util.Random;

public class Function_test {
	public static void main(String[] args) {
		System.out.println("일어남");
		이동("교육장","버스");
		boolean 과제 = 교육();
		이동("집" , "택시");
		if(과제)
			System.out.println("과제");
		System.out.println("잔다");
		
	}
	
	// void는 return값없음
	// return 값이 boolean
	public static boolean 교육() { 
		System.out.println("수업");
		System.out.println("점심");
		System.out.println("실습");
		
		Random random = new Random();
		return random.nextBoolean();
	}
	
	public static void 이동(String 장소 , String 탈것) { //매개변수 2개
		System.out.println(장소+"(으)로 "+탈것+"(을/를)타고 이동한다.");
	}
	
}
