package example02;

import java.util.Scanner;

public class Ex08_Sungjuk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("국어점수 : ");
		String kor_ = sc.nextLine();
		
		System.out.println("영어점수 : ");
		String eng_ = sc.nextLine();
		
		System.out.println("수학점수 : ");
		String mat_ = sc.nextLine();
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);
		int tot = kor + eng + mat;
		double avg = tot/3;
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i =0; i<50; i++) {
			System.out.print("-");
		}
		System.out.println("\n" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg);

	}

}
