package my03;

import java.util.Scanner;

public class practice {
	Scanner scanner = new Scanner(System.in);
	//상품의 이름과 가격을 입력하고 계속 반복하면서 출력하기 
	//필드
	
	String pdname;
	int price;
		

	//생성자
	
//	public practice(String pdname, int price) {
//		this.pdname = pdname;
//		this.price = price;
//		}
	public practice() {
		scanner();
	}
	
	//메소드
	

	public void scanner() {
		System.out.println("상품이름 : ");
		String pdname = scanner.nextLine();
		System.out.println("상품가격 : ");
		String price_ = scanner.nextLine();		
		int price = Integer.parseInt(price_);
		
		this.pdname = pdname;
		this.price = price;
		
	}	
 
	public void total() {
    	System.out.println(pdname + "\t" + price);
    }


}
