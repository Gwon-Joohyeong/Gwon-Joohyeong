package my02;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("고기로 만든 사료");
		
	}

	@Override
	public void move() {
		System.out.println("네발로 걷는다");
		
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}

}
