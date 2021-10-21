package example03;

import java.util.Scanner;

public class Ex07_Gugudan {

	public static void main(String[] args) {
		//
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요: ");
		String dan_ =sc.nextLine();
		
		int dan =Integer.parseInt(dan_);
		
		for(int i=1; i<9; i++) {
			System.out.println(dan + "*"+ i + (dan *i));
			}
		}

	}

