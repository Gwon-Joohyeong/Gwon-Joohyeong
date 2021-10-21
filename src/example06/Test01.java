package example06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
// 		입력: 이름, 주민번호, 전화번호
//		        이름에 q를 입력하면 빠져나간다.
//		출력 : 이름, 나이, 성별, 주민번호, 전화번호
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> jumins = new ArrayList<>();
		ArrayList<String> phones = new ArrayList<>();
		
		
		while(true) {
			System.out.println("이름: ");
			String name= scanner.nextLine();
			if(name.toLowerCase().equals("q")) {break;}
			System.out.println("주민번호: ");
			String jumin = scanner.nextLine();
			System.out.println("전화번호: ");
			String phone = scanner.nextLine();
			
			names.add(name);
			jumins.add(jumin);
			phones.add(phone);
	
			}
			
			System.out.println(names);
			System.out.println(jumins);
			System.out.println(phones);
			
			
			for(int i=0; i<names.size(); i++) {
				String name = names.get(i);
				String jumin = jumins.get(i);
				String phone =phones.get(i);
				
				String gender="";
				
				String imsi= jumin.substring(7,8);
				if(imsi.equals("1")||imsi.equals("3")) {
					gender = "남자";
				}else {
					gender = "여자";
					
					
				String year_=jumin.substring(0,2);
				int year=Integer.parseInt(year_);
				if(imsi.equals("1")||imsi.equals("2")) {
					year= year+1900;
				}else {
					year=year+2000;
				}
				int age= 2021-year+1;
				
				System.out.println(i+ name +"\t" + age +"\t" + gender + "\t" +jumin+ "\t" + phone);
				}
			}
	  }
}
