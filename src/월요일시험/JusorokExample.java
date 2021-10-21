package 월요일시험;

import java.util.ArrayList;
import java.util.Scanner;

public class JusorokExample {

	public static void main(String[] args) {
		ArrayList<Jusorok> list = new ArrayList<>();	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴(0:종료 1:목록 2:등록) :");
			String menu=scanner.nextLine();
			if(menu.equals("1")) {
				for(int i=0; i<list.size(); i++) {
					list.get(i).display();
				}
			}else if(menu.equals("2")) {

				System.out.println("이름 : ");
				String name = scanner.nextLine();
				System.out.println("전화번호 : ");
				String phone=scanner.nextLine();

				list.add(new Jusorok(name,phone));
			}else {
				break;
			}
		}

		System.out.println("--프로그램종료--");

	}
}