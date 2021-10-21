package my;

public class Test03 {

	public static void main(String[] args) {
//		2015년 : 윤년
//		2015년 : 평년
		
//		윤연: 4년마다 돌아오는데, 100으로 나누어 떨어지는 연도는 평년이다.
//		하지만 400으론 나누어 떨어지는 연도는 윤년이다.
		
		int Year=2015;
		
		if(Year%4==0 && Year%100 !=0 || Year % 400 ==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
	}

}
