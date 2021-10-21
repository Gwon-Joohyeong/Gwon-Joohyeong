package my03;


import java.util.ArrayList;
import java.util.Scanner;

public class practice_example2 {

	public static void main(String[] args) {

		ArrayList< practice2>list = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);


		while(true) {
			System.out.println("메뉴 (0: 종료, 1: 조회, 2: 등록)");
			String menu = scanner.nextLine();
			
			if(menu.equals("1")) {
				for(int i=0; i<list.size(); i++) {
					list.get(i).display();
				}
			
			}else if(menu.equals("2")) {
				list.add(new practice2());
				
				System.out.println("--등록--");
			}else if(menu.equals("0")) {
				System.out.println("--프로그램 종료--");
				break;
			}
		}

	
	}
}
