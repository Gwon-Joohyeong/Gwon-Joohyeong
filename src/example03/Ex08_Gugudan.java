package example03;

import java.util.Scanner;

public class Ex08_Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		짝수만 출력하는 방법
		
		for(int i=2; i<=8; i=i+2) { //2씩 증가시킨다.
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
	//2에서 8까지인데 짝수만 출력
		for(int i=2; i<=8; i++) {
			if(i%2==0)
			System.out.println(i);
		}
	// 앞부분은 2~4까지 세번반복하고 뒷부분은 1~3까지 세번반복한다.
		System.out.println("---------------------");
		
		for(int i=2; i<=4; i++) {
			for(int j=1; j<=3; j++)
				System.out.println(i + ", " + j);
			}
		}

	}

