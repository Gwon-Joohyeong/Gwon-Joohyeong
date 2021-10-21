package my03;

import java.util.Scanner;

public class practice2 {
	
	Scanner scanner = new Scanner(System.in);
	
   //필드
	
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
   //생성자
	public practice2( ) {
		scanner();	
	}

   // 메소드
	
	public void scanner() {
		System.out.println("이름 : ");
		name = scanner.nextLine();
		
		System.out.println("국어 : ");
		String kor_ = scanner.nextLine();
		
		System.out.println("영어: ");
		String eng_ = scanner.nextLine();
		
		System.out.println("수학 : ");
		String mat_ = scanner.nextLine();
		
		kor = Integer.parseInt(kor_);
		eng = Integer.parseInt(eng_);
		mat = Integer.parseInt(mat_);	
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		
	}
	
	public void display () {
		String msg;
		msg ="";
		msg = msg + "이름 : ";
		msg = msg + name;
		msg = msg +", 국어점수 : ";
		msg = msg + kor;
		msg = msg +", 영어점수 : ";
		msg = msg + eng;
		msg = msg +", 수학점수 : ";
		msg = msg + mat;
		msg = msg + ", 총점 : ";
		msg = msg + tot;
		msg = msg + ", 평균 : ";
		msg = msg + avg;
		System.out.println(msg);
	}
	
}
	
