package 월요일시험;

import java.util.ArrayList;
import java.util.Scanner;

public class JusorokExample2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Jusorok2> list = new ArrayList<>();
		
		while(true) {
			System.out.println("메뉴: (0:종료 1:등록 2:조회 ) :");
			String menu=scanner.nextLine();
				if(menu.equals("1")) {
					 for(int i=0; i<list.size(); i++) {
						 list.get(i).tot();
					 }
					
				}else if(menu.equals("2")) {
					list.add(new Jusorok2());
					
				}else if(menu.equals("0")) {
					System.out.println("--프로그램 종료--");
					break;
				}
			}
		
		
		
	}	
}