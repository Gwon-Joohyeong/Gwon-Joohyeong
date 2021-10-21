package example09;

public class product {
	
	//필드
	String name;
	int price;
	

	//생성자

	public product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	//메소드
	public void getdisplay () {
		System.out.println(name + "\t" + price);
	}
	
	
}
//		라이브러리 클래스에서 필드, 생성자, 메소드를 만들어 둔다.
//		실행클래스에서 한다
//		객체를 생성해라
//		객체 안의 필드에 값을 담아라
//		객체를 리스트에 담아라
//		
//		박복문 돌면서 인덱스 별로 객체를 꺼집어 내라
//		꺼집어 낸 객체 안에 들어있는 필드의 값을 뽑아내어 기본형 변수에 담아라