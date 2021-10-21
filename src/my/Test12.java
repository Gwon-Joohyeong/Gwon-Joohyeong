package my;

public class Test12 {

	public static void main(String[] args) {
		// 3의 배수만 빼고 출력하시요/ for이랑 if문 사용하기
		
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
