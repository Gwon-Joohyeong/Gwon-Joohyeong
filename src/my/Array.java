package my;

public class Array {

	public static void main(String[] args) {
		// 배열 활용하기
		
		int [] intArray = {100, 70, 80, 90, 60}; //5개의 값을 정렬할 수 있는 배열을 만들어라.
		System.out.println(intArray);
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("---------------------------------------");
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("---------------------------------------");
		
		int i=0;
		while(i<intArray.length) {
			System.out.println(intArray[i]);
			i++;
		}
	}

}
