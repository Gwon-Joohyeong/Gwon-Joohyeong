package example04;

import java.util.ArrayList;

public class Ex08_ArrayList {

	public static void main(String[] args) {
		//list�� �迭�� ������ �ݺ��� for���� ����.
		// ArrayList �ڷ����� List ������ 1���� 10���� �����ϰ�, for���� �̿��ؼ� �� ���
		
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
			System.out.println(list.get(i)); //list�� get���� �ҷ��;��Ѵ�.
		}
	}

}
