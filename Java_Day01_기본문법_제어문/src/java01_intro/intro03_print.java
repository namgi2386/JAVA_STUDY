package java01_intro;

public class intro03_print {
	public static void main(String[] args) {
		
		System.out.print("no1\n");
		System.out.println("no\\2");
		System.out.println("no\"3");
		System.out.printf("this is %d ok? \n",10);
		System.out.printf("this is %o ok? \n",10);
		System.out.printf("this is %x ok? \n",10);
		System.out.printf("%f \n",10.0); // 소수 6째자리
		System.out.printf("%.2f \n",10.0); // 소수 2째자리 (반올림)
		System.out.printf("%4d\n",11); // __11
		System.out.printf("%-4d\n",11); // 11__
		System.out.printf("%04d\n",11); // 0011
		System.out.printf("%s\n","안녕");
		System.out.printf("%c\n",'A');
		System.out.printf("%d\n", (int)'A');
		

	}
}
