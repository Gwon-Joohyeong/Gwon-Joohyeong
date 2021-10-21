package my;

public class Array_List {

	public static void main(String[] args) {
		// 배열에 담김 이름, 생일로 배열에 나이를 구하라	
		//배열 그리고 반복문 for
		
		String[] name = {"가가가", "나나나", "다다다", "라라라", "바바바"};
		int[]birth = {1999, 1982, 1980, 2001,2009};
		int[]ages = new int[name.length];
		
		for(int i=0; i<name.length; i++) {
			ages[i] = 2021 - birth[i] + 1;
			System.out.println(ages[i]);
		}
		


	}

}
