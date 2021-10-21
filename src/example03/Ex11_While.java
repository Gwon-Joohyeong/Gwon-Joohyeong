package example03;

public class Ex11_While {

	public static void main(String[] args) {
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		int i=1;
//		while(i<=10) { //증가식이 없어서 i는 계속1이다.
//			System.out.println(i);
//			i++;
//		}
//		
//		int j=1;
//		while(j<10) { //증가식이 없어서 i는 계속1이다.
//			j++;
//			System.out.println(j);
		
//		System.out.println("==================================================");
			
//		int i=1;
//		while(i<=10) {
//			System.out.println(i++); //i를 먼저 찍고 1씩 더해라라는 뜻
//		}
//		
//		int i=1;
//		int tot=0;
//		while(i<=10) {
//			tot = tot+i;
//			i++;
//		}
//		System.out.println(tot);
		
		System.out.println("==================================");
		int hab=0; // 여기서 총점 변수를 지정하고 
		int i=1; // 정수 i에 1값을 대입한다.
		while(true) { // 참인 조건이면 무한반복인 while문을 지정함
			System.out.println(i); //
			hab=hab+i; // 총점에 합을 더해준다
				i++; // 0인 총점은 1씩 증감연산하다
 				if(i>10) {break;} // 증감한 i값은 10 이상이면 거짓인 조건문이기 때문에 빠져가면서 
		}	
		System.out.println("합 :" + hab);
	}
}
