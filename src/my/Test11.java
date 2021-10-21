package my;

public class Test11 {

	public static void main(String[] args) {
		// for 이랑 while 을 이용해 1~10까지 반복문 만들기
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		int j=1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("------------");
		
		int a=1;
		while(a<=10) {
			System.out.println(a++);
		}
		System.out.println("------------");
		
		int b=1;
		int tot=0;
		while(b<=10) {
			tot=tot+b;
			b++;
		}
		System.out.println(tot);
	}
}
