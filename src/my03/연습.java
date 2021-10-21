package my03;

public class 연습 {
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	
	double avg;
	
	public 연습() {
		
	}

	public 연습(String name, int kor, int eng, int mat, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
	}

	public void totMethod() {
		tot = kor + eng + mat;
	}
	public void avgMethod() {		
		avg = tot/3.0;
	}
	
	public void display() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg );
	}
}
