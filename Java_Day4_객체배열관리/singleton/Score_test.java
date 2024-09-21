package singleton;

public class Score_test {
	public static void main(String[] args) {
		
		//객체 생성불가
//		ScoreManager sm = new ScoreManager(); //불가능
		
		ScoreManager sm1 = ScoreManager.getInstance();
		ScoreManager sm2 = ScoreManager.getInstance();
		
		System.out.println(sm1 == sm2); 
		//true 이름만다르고 하나의 singleton을 가르키는 중이다.
		
	}
}
