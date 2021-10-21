package exmaple08;

import java.util.ArrayList;

public class PointExample {

	public static void main(String[] args) {
		
		
		Point p1 = new Point();
		p1.name="가가가";
		p1.kor=90;
		p1.eng=80;
		p1.mat=98;
		p1.totMethod();
		p1.avgMethod();
		p1.display();
		
		Point p2 = new Point();
		p2.name="나나나";
		p2.kor=99;
		p2.eng=78;
		p2.mat=77;
		p2.totMethod();
		p2.avgMethod();
		p2.display();
		
		System.out.println("-------------------------------");
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		System.out.println(list);
		System.out.println("-------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			list.get(i);
			list.get(i).display();
		}
	}	

}
