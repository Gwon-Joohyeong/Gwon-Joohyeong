package example06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("�̸�: ");
			String name= scanner.nextLine();
			if(name.toLowerCase().equals("q")) {break;}
			System.out.println("�ֹι�ȣ: ");
			String jumin = scanner.nextLine();
			System.out.println("��ȭ��ȣ: ");
			String phone = scanner.nextLine();
			
			String imsi= name +"/" + jumin + "/" + phone; //���ڿ��� �ϳ��� ��Ƽ�
			list.add(imsi); //����Ʈ�� ����
//			list.add(imsi=name +"/" + jumin + "/" + phone); ���� �����̶� �Ȱ��� ��.
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
