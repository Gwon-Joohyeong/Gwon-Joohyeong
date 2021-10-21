package my03;

import java.util.ArrayList;
import java.util.Scanner;

public class practice_example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<practice> list = new ArrayList<>();
//		practice li= new practice(null, 0);
		
		while(true){
			System.out.println("메뉴(0:종료 1:조회 2:등록 ) : ");
			String menu=scanner.nextLine();
			
			if(menu.equals("0")){
				System.out.println("--프로그램 종료--");
				break;
			}else if(menu.equals("1")) {
				String total="0";
				for(int i=0; i<list.size(); i++) {	
				list.get(i).total();
				}
			
			}else if(menu.equals("2")) {
				list.add(new practice());
			}
		}
	}
}

