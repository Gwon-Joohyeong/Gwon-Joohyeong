package my03;

import java.util.ArrayList;
import java.util.Scanner;

public class fruit_example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		fruit f1 = new fruit();
		f1.name="사과";
		f1.price=1000;
		f1.count=3;
		f1.totalMoney();
		
		
		fruit f2 = new fruit();
		f2.name="바나나";
		f2.price=2000;
		f2.count=5;
		f2.totalMoney();
		
		fruit f3 = new fruit();
		f3.name="배";
		f3.price=3000;
		f3.count=9;
		f3.totalMoney();
		
		fruit f4 = new fruit();
		f4.name="포도";
		f4.price=4000;
		f4.count=7;
		f4.totalMoney();
		
		ArrayList<fruit> list = new ArrayList();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);

		for(int i =0; i<list.size(); i++) {
			list.get(i).total();
			list.get(i).totalMoney();
		}
		

	}

}
