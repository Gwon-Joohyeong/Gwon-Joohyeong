package 월요일시험;

import java.util.Scanner;

public class Jusorok2 {
	Scanner scanner = new Scanner(System.in);
	
	String name;
	String phone;
	
	
	public Jusorok2() {
		sanner();	
	}
	
	//메소드
	public void sanner(){
		
		System.out.println("이름 : ");
		String name=scanner.nextLine();
		
		System.out.println("전화번호 : ");
		String phone = scanner.nextLine();
		
		this.name = name;
		this.phone = phone;
	}
	
	public void tot(){	
		System.out.println("이름 :" + name + "전화번호 : " + phone);		
	}	
}
