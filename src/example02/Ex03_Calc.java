package example02;

import java.util.Scanner;

public class Ex03_Calc {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		int c = a + b;
		System.out.println(c);
		
		System.out.println(a-b);
		System.out.println(a*b);
		
		int d = a/b; // ��
		System.out.println(d);
		
		int e = a%b; //������
		System.out.println(e);
		
//		�Է� : ����
//		��� : --> ¦��
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��϶� : ");
		String num_ = scanner.nextLine();
		int num = Integer.parseInt(num_);
				
		if( num%2==0) {
			System.out.println("¦��");
			
		} else {
			System.out.println("Ȧ��");
		}
		
		int na = num%2;
		
		String result= "¦��";
		if(na==0) {
			System.out.println(num + " ->" + result);
		}else {
			System.out.println(num + " -> Ȧ��");
		}
		
				
	}

}
