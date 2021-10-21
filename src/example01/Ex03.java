package example01;

public class Ex03 {

	public static void main(String[] args) { //실행할 때 메인메소드 안에 있는 걸 실행한다. 
		
		int bornYear = 1999; // 정수형 변수 bornyear에 1999라는 값을 대입하라. 1999은 리터럴. 값 그 자체이다.
		int nowYear = 2021; // 2021년 리터럴
		
		int age = (nowYear - bornYear) + 1; //산술연산 : + - * / %
		
		int a = 5; 
		int b = 2;
		double c = a / (double)b; //자동형변환
		System.out.println(c);
		

	}

}
