package example03;

public class Ex12_While {

	public static void main(String[] args) {
		
//		int i=1;
//		while(true) {
//			System.out.println(i++);
//			if(i>10) break;
//		}
//		System.out.println("프로그램 종료");
		
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
