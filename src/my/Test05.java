package my;

public class Test05 {

	public static void main(String[] args) {
		// 1~10까지의 합
		

		int tot=0;
		int num=10;
		
		for( int i =1; i<=num; i++) {
			tot = tot +i;
		}
		System.out.println("1~"+ num +" 까지의 합 : " + tot);
	}

}
