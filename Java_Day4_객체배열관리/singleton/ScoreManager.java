package singleton;

public class ScoreManager {
	private int score;
	
	//싱글톤으로 만들쟝.
	// 1. only 1개만 만들자 == 외부에서 생성 불가
	//	외부생성불가 == 생성자를 private
	private ScoreManager() {} 
	
	// 2. 인스턴스를 미리 한개 만들어서 가지고 있자
	//	이것또한 private
	private static ScoreManager manager = new ScoreManager();
	
	// 3. 인스턴스를 외부에서 가져다 쓸 수 있도록 public으로 getter를 추가한다.
	// 4. 객체생성 없이 클래스 이름으로 바로 접근할 수 있도록 static을 추가한다.
	public static ScoreManager getInstance() {
		return manager;
	}
	
}
