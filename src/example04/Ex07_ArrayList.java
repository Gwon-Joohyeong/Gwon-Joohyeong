package example04;

import java.util.ArrayList;

public class Ex07_ArrayList {

	public static void main(String[] args) {
		// 리스트: 하나의 변수에 여려 개의 값을 담는 것.
		// 빈리스트에 값을 하나씩 추가하는 개념. 크기제한이 없음.
		// 이론상으로는 여려개의 자료형이 들어갈 수 있지만, 실제는 제너릭<>을 이용해서 같은 타입의 자료형만 저장시킨다.
		
//		ArrayList<Object> arrayList = new ArrayList<>(); // 오브젝트는 모든 자료형을 뜻해서 모드 다 들어갈 수 있다.
//		System.out.println(arrayList);
//		
//		arrayList.add(5);
//		System.out.println(arrayList);
//		
//		arrayList.add("이성순");
//		System.out.println(arrayList);
//		
//		arrayList.add(3.14);
//		System.out.println(arrayList);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		
		arrayList.add(5); //add는 리스트이 제일 마지막에 값을 추가하라는 뜻
		System.out.println(arrayList);
		
		arrayList.add(10);
		System.out.println(arrayList);
		
		int arrayListen = arrayList.size();
		System.out.println(arrayListen); 
		
		System.out.println(arrayList.size());//리시트 길이를 구하는 것
	}

}
