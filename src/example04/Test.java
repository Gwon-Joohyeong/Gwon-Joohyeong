package example04;

public class Test {

	public static void main(String[] args) {
		
		//섭씨온도
		//화씨온도=
		//화씨온도=(섭씨온도 * 1.8) + 32

		int[] array01 = {100, 90, 70, 80, 60};
		int[] array02 = new int[array01.length];

		for(int i=0; i<array01.length; i++) {
//			int imsi = (int)(array01[i] * 1.8) +32; //뒤에 정수 계산때문에 강제형변환 해줘야함.
//			array02[i]=imsi;
			
			array02[i]=(int)(array01[i] * 1.8) +32;
		
		}
		
		for(int i=0; i<array01.length; i++) {
			System.out.println("섭씨온도는 " + array01[i] + "도는 화씨온도 " + array02[i] + "입니다.");
		}
		
	}

}
