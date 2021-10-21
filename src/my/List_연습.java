package my;

import java.util.ArrayList;

public class List_연습 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(21);
		list.add(2);
		list.add(4);
		list.add(57);
		list.add(18);
		list.add(10);
		list.add(67);

		int hab =0;
		for(int i=1; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		
	}

}
