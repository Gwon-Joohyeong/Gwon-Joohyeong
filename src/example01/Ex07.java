package example01;

public class Ex07 {

	public static void main(String[] args) {
		
		int num1 = 10;
		
		System.out.println(Integer.MAX_VALUE);
		
		long num2 =2147483648L; //�ڿ� �� ��ü�� ���� Ÿ������ �� �� ��� ������ ����.�׷��Ƿ� L�� �ٿ�����Ѵ�.
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		int a = 100;
		String b ="200";
		System.out.println(a + b);
		
		System.out.println(a + Integer.parseInt(b));
		
		int bb = Integer.parseInt(b);
		System.out.println(a+bb);
		
		System.out.println(a - Integer.parseInt(b));
		
		//Wrqpper class (���� Ŭ����) : byte, short, long,charater, float, double
		//�⺻ �ڷ����� ���� �پ��� ���� ����� �����ϴ� Ŭ����
		//int ==> Integer
		//char ==> Charater
		//�������� �״���̸�, ù���ڸ� �빮�ڷ�.

	}

}
