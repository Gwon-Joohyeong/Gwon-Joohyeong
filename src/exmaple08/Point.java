package exmaple08;

public class Point {//���̺귯�� Ŭ���� = ���赵 (1����� �����͸� �����Ѵ�)
	//�ʵ�
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	
	double avg; //���� �̰Ÿ� �Է¹�������
	
	//������
	public Point() { //��ü������ ���� �ʿ���
		
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

	//�޼ҵ�
	public void totMethod() { //�� �޼ҵ带 ȣ���ϸ� �� �ʵ��� tot�� ���� ����
		tot = kor + eng + mat;
	}
	public void avgMethod() {
		avg=tot/3.0;
	}
	public void display() {
		System.out.println(name + "\t" + kor +"\t" +eng +"\t" + mat + "\t" + tot + "\t" +avg );
	}

}
