package example09;

import java.util.ArrayList;
import java.util.Scanner;

public class productExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);					
		
		ArrayList<product> list = new ArrayList<>();

		while(true) {
			System.out.println("메뉴(0:종료 1:목록 2:등록) : ");
			String menu= scanner.nextLine();
			
			if(menu.equals("0")) {
			break;
			
			}else if(menu.equals("1")) {
				int tot=0;
				for(int i=0; i<list.size(); i++) {
					list.get(i).getdisplay();
				}
	
			}else if(menu.equals("2")) {
				System.out.println("상품이름 : ");
				String name=scanner.nextLine();
	
				System.out.println("상품가격 : ");
				String price_=scanner.nextLine();
				int price=Integer.parseInt(price_);
				
				product p1= new product(name, price);
				list.add(p1);

		 }
			
	  }
   }
}
