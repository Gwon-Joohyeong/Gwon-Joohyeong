package exmaple08;

public class Point {//라이브러리 클래스 = 설계도 (1명분의 데이터를 저장한다)
	//필드
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	
	double avg; //이제 이거를 입력받을거임
	
	//생성자
	public Point() { //객체생성을 위해 필요함
		
	}
	public Point(String name, int kor, int eng, int mat, int tot, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
	}

	//메소드
	public void totMethod() { //이 메소드를 호출하면 위 필드의 tot에 값이 담긴다
		tot = kor + eng + mat;
	}
	public void avgMethod() {
		avg=tot/3.0;
	}
	public void display() {
		System.out.println(name + "\t" + kor +"\t" +eng +"\t" + mat + "\t" + tot + "\t" +avg );
	}

}
