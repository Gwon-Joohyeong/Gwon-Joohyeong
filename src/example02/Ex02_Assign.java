package example02;

public class Ex02_Assign {

	public static void main(String[] args) {
		
		int a =3; //대입연산자, 할당연산자
		int b =5;
		
		a += 3;
		System.out.println("a : " + a); // 3 + 3 = 6
		
		a-= 3;
		
		System.out.println("a : " + a); // 6-3 = 3
		
		a *= 3;
		System.out.println("a : " + a); //3 x 3 = 9
		
		a/= 5; // a = a/5;
		System.out.println("a : " + a); // 9 / 5 =1 정수와 정수의 연산결과는 무조건 정수이다.

	}

}
