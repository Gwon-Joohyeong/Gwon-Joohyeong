package example04;

import java.util.ArrayList;

public class Ex08_ArrayList {

	public static void main(String[] args) {
		//list랑 배열이 나오면 반복문 for문을 쓴다.
		// ArrayList 자료형인 List 변수에 1부터 10까지 저장하고, for문을 이용해서 값 출력
		
		ArrayList<Integer> list = new ArrayList<>();	

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //list는 get으로 불러와야한다.
		}
	}

}
