package example05;

public class Student {
	//�ʵ�
	private String hakbun;
	private String name;
	private int year;
	
	
	//������
	public Student() {
		
	}
	
	
	public Student(String hakbun, String name, int year) {
		this.hakbun = hakbun;
		this.name = name;
		this.year = year;
	}


	//�޼ҵ�


public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
}