package example04;

import java.util.ArrayList;

public class Ex07_ArrayList {

	public static void main(String[] args) {
		// ����Ʈ: �ϳ��� ������ ���� ���� ���� ��� ��.
		// �󸮽�Ʈ�� ���� �ϳ��� �߰��ϴ� ����. ũ�������� ����.
		// �̷л����δ� �������� �ڷ����� �� �� ������, ������ ���ʸ�<>�� �̿��ؼ� ���� Ÿ���� �ڷ����� �����Ų��.
		
//		ArrayList<Object> arrayList = new ArrayList<>(); // ������Ʈ�� ��� �ڷ����� ���ؼ� ��� �� �� �� �ִ�.
//		System.out.println(arrayList);
//		
//		arrayList.add(5);
//		System.out.println(arrayList);
//		
//		arrayList.add("�̼���");
//		System.out.println(arrayList);
//		
//		arrayList.add(3.14);
//		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		
		arrayList.add(5); //add�� ����Ʈ�� ���� �������� ���� �߰��϶�� ��
		System.out.println(arrayList);
		
		arrayList.add(10);
		System.out.println(arrayList);
		
		int arrayListen = arrayList.size();
		System.out.println(arrayListen); 
		
		System.out.println(arrayList.size());//����Ʈ ���̸� ���ϴ� ��
	}

}
