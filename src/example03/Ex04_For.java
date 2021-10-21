package example03;

import java.util.Scanner;

public class Ex04_For {

	public static void main(String[] args) {
		// 휴가일수계산
//		근속년수 1~3년 : 3일
//		근속년수 4~9년 : 5일
//		근속년수 10년이상 : 10일
//		근속년수 20년이상 :20일
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근속년수 : ");
		String year_ = sc.nextLine();
		int year = Integer.parseInt(year_);
		
        String vacation ="";        
		if(year >= 20) {
			vacation="20일";
		} else if(year >= 10) {
			vacation="10일";
		} else if(year >= 9) {
			vacation="5일";
		}else if (year >=1 && year <= 3 ) {
			vacation="3일";
		}

		System.out.println("휴가일 :" + vacation);
	}

}
