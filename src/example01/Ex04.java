package example01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		키보드로 입력을 받는다
//		이름, 출생년도를 입력받아서 나이를 출력
		System.out.println("이름 : ");
		String name = sc.nextLine(); //나중에 문자열과 정수를 합치게되면 오류날 수도 있는데 nextLine();은 오류 안남
		
		System.out.println("출생년도");
		String year_ = sc.nextLine();
		int year = Integer.parseInt(year_);
		
		year = 2021 - year + 1;
		
		System.out.println("이름 : " + name + "나이 : " + year);
		
	}

}
