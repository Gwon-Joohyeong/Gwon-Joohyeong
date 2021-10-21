package example04;

public class Ex04_Array_String {

	public static void main(String[] args) {
		
		
		String[] names = {"홍길동","이성순","장천용","이상대","김춘삼"};
		int[] birth= {1995,1971,1964,1989, 1999};
		int[] ages = new int [birth.length];
		
		
		for(int i=0; i<birth.length; i++) {
			ages[i] = 2021 - birth[i] + 1;
			System.out.println(names[i] + "의 나이는 " + ages[i] + "세입니다.");
		}
		

	}

}
