package example06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("이름: ");
			String name= scanner.nextLine();
			if(name.toLowerCase().equals("q")) {break;}
			System.out.println("주민번호: ");
			String jumin = scanner.nextLine();
			System.out.println("전화번호: ");
			String phone = scanner.nextLine();
			
			String imsi= name +"/" + jumin + "/" + phone; //문자열에 하나로 담아서
			list.add(imsi); //리스트에 담음
//			list.add(imsi=name +"/" + jumin + "/" + phone); 위에 문장이랑 똑같은 것.
			}
		
		for(int i=0; i<list.size(); i++) {
			String imsi=list.get(i);
			String[] imsiArray=imsi.split("/");
			String name= imsiArray[0];
			String jumin= imsiArray[1];
			String phone= imsiArray[2];
//			System.out.println(list.get(i));
			System.out.println(i + ":" + name + "/" + jumin + "/" + phone);
	}
  }
}
