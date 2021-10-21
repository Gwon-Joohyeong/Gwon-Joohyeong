package example02;

public class Ex06_For {

	public static void main(String[] args) {
		
//		1~10까지의 합, 짝수의 합, 홀수의 합.
		int num =10; // 변수처리하는게 훨씬 더 편리하다. 아니면 스캐너처리하기.
		int tot1 =0;
		int tot2 =0;
		int tot3 =0;
		
		for(int i=1; i<=num; i++) {
			tot1 = tot1 +i; //누적되서 전체가 더해짐
			if(i%2==0) {
				tot2 = tot2 + i;
			}else {
				tot3 = tot3 + i;
			}

		}
			System.out.println("1~10까지의 합 : " + tot1);
			System.out.println("짝수의 합 : " + tot2);
			System.out.println("홀수의 합 : " + tot3);	
	}
}
