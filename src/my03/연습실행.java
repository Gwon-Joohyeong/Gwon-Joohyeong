package my03;

import java.util.ArrayList;

public class 연습실행 {

	public static void main(String[] args) {
		
		연습 a1 = new 연습();
		a1.name="가가가";
		a1.kor=90;
		a1.eng=98;
		a1.mat=88;
		a1.totMethod();
		a1.avgMethod();
		a1.display();
		
		연습 a2 = new 연습();
		a2.name="나나나";
		a2.kor=99;
		a2.eng=87;
		a2.mat=93;
		a2.totMethod();
		a2.avgMethod();
		a2.display();
		
		ArrayList<연습> list = new ArrayList();
		list.add(a1);
		list.add(a2);
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).display();
			
		}

	}

}
