package my;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		 arrayList.add(10);
		 arrayList.add(32);
		 arrayList.add(15);
		 arrayList.add(99);
		 arrayList.add(94);
		 arrayList.add(45);
		 arrayList.add(57);
		 
		 for(int i=1; i<arrayList.size(); i++) {
			 arrayList.add(i);
		 }
		 System.out.println(arrayList);
		 
		 for(int i=1; i<arrayList.size(); i++) {
			 System.out.println(arrayList.get(i));
		 }
		
	}

}
