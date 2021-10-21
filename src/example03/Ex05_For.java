package example03;

public class Ex05_For {

	public static void main(String[] args) {
		
//		for(int i =0; i<5; i++) {
//			System.out.println(i + ", -");
//		}

		int num = 10;
		int sum = 0;
		
		for(int i =0; i<=num; i++) {
			sum = sum +i;//누적
			
			System.out.println("1~" + num + "까지의 합" + sum);
		}
	}

}
