package example03;

public class Ex03_LeapYear {

	public static void main(String[] args) {
		
//		2015년 : 윤년
//		2015년 : 평년
		
//		윤연: 4년마다 돌아오는데, 100으로 나누어 떨어지는 연도는 평년이다.
//		하지만 400으론 나누어 떨어지는 연도는 윤년이다.
		
		int inputYear = 2015;
		
		String year = "";
		if(inputYear % 4 ==0 && inputYear % 100 != 0 || inputYear % 400 ==0) {
			year = "윤년";
		}else {
			year = "평년";
		}


	}

}
