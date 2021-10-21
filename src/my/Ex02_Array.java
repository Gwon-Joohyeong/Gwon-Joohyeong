package my;

public class Ex02_Array {

	public static void main(String[] args) {

		int[] intArray = new int[10];//정수 10개가 들어가는 정수형배열 intArray를 만들어러ㅏ

		intArray[0]=99;
		intArray[1]=77;
		intArray[2]=98;
		intArray[3]=89;
		intArray[4]=76;
		intArray[5]=65;
		intArray[6]=88;
		intArray[7]=97;
		intArray[8]=92;
		intArray[9]=80;
		
		
		for(int i=1; i<intArray.length; i++) {
			System.out.println(i + "번짹 인덱스의 값" + intArray[i]);
		}
	
		System.out.println("-------------------------");

	}	

}
