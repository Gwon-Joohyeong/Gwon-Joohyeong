package my02;

public class Rabbit implements Animal {

	@Override
	public void eat() {
		System.out.println("당근을 먹는다");
		
	}

	@Override
	public void move() {
		System.out.println("네발로 움직인다");
		
	}

	@Override
	public void sound() {
		System.out.println("??");
		
	}

}
