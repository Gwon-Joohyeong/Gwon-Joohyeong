package example04;

public class Ex04_String {

	public static void main(String[] args) {
		
		String[] strArray = new String[10]; //문자열 10기를 저장하는 배열을 만들어라
		Double[] doubleArray = new Double[10];
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(i + "번째 인덱스의 값 : " + strArray[i] );
			
			strArray[0]="홍길동";
			strArray[1]="홍나겸";
			strArray[2]="홍가가";
			strArray[3]="박길동";
			strArray[4]="고길동";
			strArray[5]="고둘리";
			strArray[6]="침푸이";
			strArray[7]="도라에몽";
			strArray[8]="무도사";
			strArray[9]="배추도사";
		}

	}

}
