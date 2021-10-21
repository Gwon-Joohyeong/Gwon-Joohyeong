package example03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2~8까지 짝수만 출력하기
		
		for(int i=2; i<=8; i++) {
			if(i%2==0) {
				System.out.println(i);
			} 
		}
		
		System.out.println("--------------------");
		// 앞부분은 2~4까지 세번반복하고 뒷부분은 1~3까지 세번반복한다.
		
		for(int j=3; j<=8; j++) {
			for(int k=2; k<=9; k++) {
				System.out.println(j + ", " + k);
			}
		}
	
	}

}
