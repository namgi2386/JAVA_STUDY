package modifier01;

public class Person_test {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		//---------------------------------------------------------------------//
		// private한 name 은 여기서 접근 불가
//		p.name = "noman";
		//---------------------------------------------------------------------//
		// default한 default_name 은 접근 가능
		p.default_name ="okman";
		//---------------------------------------------------------------------//
		p.pro_name = "heyyou";
		//---------------------------------------------------------------------//
		p.pub_name = "yaha";
	}
	
}
