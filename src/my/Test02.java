package my;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//국어 영어 수학 총첨이랑 평균 그리고 등급 나누기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		String kor_=sc.nextLine();
		int kor = Integer.parseInt(kor_);
		
		System.out.println("영어점수 : ");
		String eng_=sc.nextLine();
		int eng = Integer.parseInt(eng_);
		
		System.out.println("수학점수 : ");
		String mat_=sc.nextLine();
		int mat = Integer.parseInt(mat_);
		
		int tot= kor + eng + mat;
		double avg=tot/3;
		
		System.out.println(avg);
		
		String grade="";
		
		if(avg>=90 && avg<=100) {
			grade="수";
		}else if(avg>=80){
			grade="우";
		}else if(avg>=70){
			grade="미";
		}else if(avg>=60){
			grade="양";
		}else{
			grade="가";
		}
		
		System.out.println("성적 : " + grade);
	}

}
