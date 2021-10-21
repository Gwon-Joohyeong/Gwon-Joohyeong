package example03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 구구단을 2에서 9단까지 다 찍는 것.
		//먼저 출력문과 for문 이랑 곱하기 출력문이 필요하다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		String dan_ = sc.nextLine();
		int dan = Integer.parseInt(dan_);
		
		System.out.println("정수2를 입력하세요.");
		String dan2_ = sc.nextLine();
		int dan2 = Integer.parseInt(dan2_);
		
		for(int i=1; i<dan; i++) {
			for(int j=1; j<dan2; j++) {
				System.out.println(i + "*" + j + " = " + (i*j));	
			}

		}
		
		//2001~2021 년까지 출력
		int a = 2001;
		int b=2021;
		
		for(int i=a; i<=b; i++) {
			if(i%2==1)
			System.out.println(i);
		}
				
	}

}
	