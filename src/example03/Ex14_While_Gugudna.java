package example03;

import java.util.Scanner;

public class Ex14_While_Gugudna {

	public static void main(String[] args) {
		// while 3단까지 찍기
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수를 입력해주세요 : ");
//		String num_=sc.nextLine();
//		int num=Integer.parseInt(num_);
//		
//		for(int e=3; e<=3; e++) {
//			for(int j=3; j<=num; j++)	
//		System.out.println( e + "*" + num + "=" + (e*j));
//		
		
		System.out.println("=============================");
		
		int i=1;
		int dan=3;
		while(i<10) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			i++;
		}
		
		System.out.println("=============================");
		
		int dan2=3;
		int k=1;
		while(true) {
			System.out.println(dan2 + " * " + k + " = " + (dan2 * k));
			k++;
			if(k >=10) {
				break;
			}
			
			//숙제 : 주말에 while문 위에 두개 완전히 이해하기
		 }
	  }
   }
