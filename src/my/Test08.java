package my;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 1. 짝수만 출력하기
		// 2. 2 ~ 20까지 짝수만 출력
		// 3. 앞부분은 1~10까지 반복하고 뒷부부능ㄴ 2~11까지 반복하기
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("------------------------");
		
		for(int j=2; j<=20; j++) {
			if(j%2==1)
				System.out.println(j);
		}
		System.out.println("------------------------");
		
		for(int a=1; a<=10; a++) {
			for(int b=2; b<=11; b++) {
				System.out.println(a + ", " + b);
			}
		}
	}

}
