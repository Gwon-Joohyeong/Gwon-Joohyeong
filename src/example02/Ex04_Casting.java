package example02;

public class Ex04_Casting {

	public static void main(String[] args) {
		
		float f = 1.6F;
		System.out.println(f);
		
		f=100; //정수값은 실수형으로 자동형변환 된다.
		
		System.out.println(f);
		
		f = 100.5F;
		int i = (int)f;//실수값을 정수형으로 강제형변환. casting이라고 한다. 
		System.out.println(i);
		
		i = 5000;
		
		byte b =(byte)i;// 인트타입 i가 byte보다 값이 크니 강제형변환해서 대입해라
		System.out.println(i);
	}

}
