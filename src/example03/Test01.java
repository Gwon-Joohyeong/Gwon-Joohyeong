package example03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 1~10까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		//먼저 스캔부터 하고, 포문으로 증가식 만들어주고 출력하기
		System.out.println("정수를 입력하세요 : ");
		String num_ = sc.nextLine();
		int num = Integer.parseInt(num_);
		
		int a = 10;
		for(int i=1; i<=a; i++) {
			num = num + i;
		}
		System.out.println("1~" + a + "까지의 합 :" + num);
		
	}

}
