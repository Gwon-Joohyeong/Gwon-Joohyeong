package example04;

public class Ex01_Array {

	public static void main(String[] args) {
		
		int[] intArray = {100, 70, 90, 60, 80};	//5개의 값을 정렬할 수 있는 배열을 만들어라.
		System.out.println(intArray);
		
		System.out.println("----------------------------------");
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("----------------------------------");
		for(int i=0; i<intArray.length; i++) { //i를 인덱스로 활용
			System.out.println(intArray[i]);	
		}
		
		System.out.println("----------------------------------");
		
		int i=0;
		while(i<intArray.length){ //while문은 for문처럼 증감식이 없어서 증감식을 추가로 써준다.
			System.out.println(intArray[i]);
			i++;
		}

	}

}
