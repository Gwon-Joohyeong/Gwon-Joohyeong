package example03;

import java.util.Scanner;

public class Ex09_Gugudan {

	public static void main(String[] args) {
		// 구구단을 2에서 9단까지 다 찍는 것.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		String dan_ = sc.nextLine();
		int dan = Integer.parseInt(dan_);
		
		System.out.println("정수를 입력하세요 : ");
		String dan2_ = sc.nextLine();
		int dan2 = Integer.parseInt(dan2_);

		
		for(int i=2; i<=dan; i++) { // 바깥쪽 9번 돌고
			for(int j=1; j<=dan2; j++) { // 안쪽도 9번 돈다.
				
				System.out.println(i + "*" + j + " = " + (i*j));
			}
			
			System.out.println("----------------------");
		}
	
	
	
	
	}
	

}
