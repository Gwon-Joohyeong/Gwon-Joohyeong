package example02;

import java.util.Scanner;

public class Ex03_Calc {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		int c = a + b;
		System.out.println(c);
		
		System.out.println(a-b);
		System.out.println(a*b);
		
		int d = a/b; // ¸ò
		System.out.println(d);
		
		int e = a%b; //³ª¸ÓÁö
		System.out.println(e);
		
//		ÀÔ·Â : Á¤¼ö
//		Ãâ·Â : --> Â¦¼ö
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¶ó : ");
		String num_ = scanner.nextLine();
		int num = Integer.parseInt(num_);
				
		if( num%2==0) {
			System.out.println("Â¦¼ö");
			
		} else {
			System.out.println("È¦¼ö");
		}
		
		int na = num%2;
		
		String result= "Â¦¼ö";
		if(na==0) {
			System.out.println(num + " ->" + result);
		}else {
			System.out.println(num + " -> È¦¼ö");
		}
		
				
	}

}
