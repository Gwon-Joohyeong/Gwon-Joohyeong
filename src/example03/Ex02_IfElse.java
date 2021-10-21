package example03;

public class Ex02_IfElse {

	public static void main(String[] args) {
		
		int kor =90, eng =80, mat =70;
		int tot = kor + eng + mat;
		double avg = tot /3;
		
		String grade ="";
		
		if(avg>=95 && avg<=100) {
			grade = "A++";
		}else if (avg>80 && avg<95) {
			grade = "A";
		}else if (avg>=80) {
			grade ="우";
		}else if (avg>=70) {
			grade ="미";
		}else if (avg>=60) {
			grade ="양";
		}else {
			grade = "가";
		}

	}

}
