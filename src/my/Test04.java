package my;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 휴가일수계산
//		근속년수 1~3년 : 3일
//		근속년수 4~9년 : 5일
//		근속년수 10년이상 : 10일
//		근속년수 20년이상 :20일
		
		Scanner sc = new Scanner(System.in);
		System.out.println("근속년수 : ");
		String work_=sc.nextLine();
		int work = Integer.parseInt(work_);
		
		String day ="";
		if(work>=20) {
			day="20일";
		}else if(work>=10) {
			day="10일";
		}else if(work>=4) {
			day="5일";
		}else if(work>=1 && work<=3) {
			day="3일";
		}
		
		System.out.println("휴가일 : " + day);
	}

}
