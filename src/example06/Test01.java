package example06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
// 		�Է�: �̸�, �ֹι�ȣ, ��ȭ��ȣ
//		        �̸��� q�� �Է��ϸ� ����������.
//		��� : �̸�, ����, ����, �ֹι�ȣ, ��ȭ��ȣ
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> jumins = new ArrayList<>();
		ArrayList<String> phones = new ArrayList<>();
		
		
		while(true) {
			System.out.println("�̸�: ");
			String name= scanner.nextLine();
			if(name.toLowerCase().equals("q")) {break;}
			System.out.println("�ֹι�ȣ: ");
			String jumin = scanner.nextLine();
			System.out.println("��ȭ��ȣ: ");
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
					gender = "����";
				}else {
					gender = "����";
					
					
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
