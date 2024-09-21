package StudentManager;

public class StudentManager {

	//싱글톤으로 만들거야
	//우선 빈배열 만들기
	Student[] arr = new Student[100]; 
	int size = 0; //실제 들어있는 갯수 기록
	
	private static StudentManager instance = new StudentManager();
	
	private StudentManager() {}
	
	public StudentManager getInstance() {
		return instance;
	}
	
	public void addStudent(Student st) { 
		if(size <100) {
			arr[size] = st;
			size++;
		} else {
			System.out.println("인원초과");
		}
	}
	
	
	
}
