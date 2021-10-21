package my;

public class List_화씨온도 {

	public static void main(String[] args) {
		//섭씨온도
		//화씨온도=
		//화씨온도=(섭씨온도 * 1.8) + 32
		
		//먼저 배열을 입력하고 화씨온도 를 계산할 수식이 필요하며 이걸 반복할 조건문이 들어간 반복문이 필요하다
		
		int[] array1 = {80, 70, 40 ,60, 75};
		int[] array2 = new int[array1.length];
		
		
		for(int i=0; i<array1.length; i++) {
			array2[i]= (int)(array1[1] * 1.8) +32;
			int imsi =(int)(array1[1] * 1.8) +32;
			array2[i]=imsi;
		}
		
		for (int i=0; i<array1.length; i++) {
			System.out.println("섭씨온도는 " + array1[i] +" 화씨온도는 " + array2[i]);
		}
	}

}
