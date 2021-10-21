package my;

public class Test13 {

	public static void main(String[] args) {
		// while 3단까지 찍기
		
		int i=1;
		int dan =3;
		
		while(i<10) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			i++;
		}
	
		int a=1;
		int dan2=3;
		while(true) {
			System.out.println(dan2 + "*" + a + "=" + (dan2*a));
			a++;
			if(a>=10) {
				break;
			}
		} 
	
	
	}

}
