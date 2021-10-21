package my;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 짝수 홀수 나누기
		
		Scanner sc = new Scanner(System.in);
		String num_=sc.nextLine();
		int num = Integer.parseInt(num_);
		
		String result="";
		if(num%2==0) {
			result ="짝수";
		}else {
			result="홀수";
		}
		
		System.out.println(num + "=" + result);
	}
	
}
