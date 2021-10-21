package my02;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("생선을 먹는다");
		
	}

	@Override
	public void move() {
		System.out.println("네발로 걷는다");
		
	}

	@Override
	public void sound() {
		System.out.println("야옹야옹");

		
	}

}
