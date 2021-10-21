package my;

public class Test09 {

	public static void main(String[] args) {
		// 1~9단까지 구해라
		
		int gog=0;
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {	
				gog=i*j;	
				System.out.println(i + "*" + j + " = " + (gog));
			}
	
		}

	}

}
