package example01;

public class Ex07 {

	public static void main(String[] args) {
		
		int num1 = 10;
		
		System.out.println(Integer.MAX_VALUE);
		
		long num2 =2147483648L; //뒤에 값 자체가 무슨 타입인지 알 수 없어서 오류가 난다.그러므로 L을 붙여줘야한다.
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		int a = 100;
		String b ="200";
		System.out.println(a + b);
		
		System.out.println(a + Integer.parseInt(b));
		
		int bb = Integer.parseInt(b);
		System.out.println(a+bb);
		
		System.out.println(a - Integer.parseInt(b));
		
		//Wrqpper class (래퍼 클래스) : byte, short, long,charater, float, double
		//기본 자료형에 대한 다양한 연산 기능을 제공하는 클래스
		//int ==> Integer
		//char ==> Charater
		//나머지는 그대로이며, 첫글자만 대문자로.

	}

}
