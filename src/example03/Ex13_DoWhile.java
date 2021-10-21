package example03;

public class Ex13_DoWhile {

	public static void main(String[] args) {
		// while 문은 조건을 만족하지 않으면 한번도 실행  안할 수 있다.
		
		int i=1;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		System.out.println("프로그램 종료");
	}

}
