package my03;

class Test{
	String name="가가가";
	int age = 19;
	double height =180;
	
}

public class Class_연습 {
	public static void main(String[] args) {
	
	Test t1 = new Test();
	
	System.out.println(t1.name);
	System.out.println(t1.age);
	System.out.println(t1.height);
	
	
	t1.name = "다다다";
	t1.age = 19;
	t1.height = 180;
	
	System.out.println(t1.name);
	System.out.println(t1.age);
	System.out.println(t1.height);
	
	Test t2 = new Test();
	
	t2.name = "나나나";
	t2.age = 22;
	t2.height = 178;
	
	System.out.println(t2.name);
	System.out.println(t2.age);
	System.out.println(t2.height);
	
	}
}
