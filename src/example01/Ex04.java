package example01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Ű����� �Է��� �޴´�
//		�̸�, ����⵵�� �Է¹޾Ƽ� ���̸� ���
		System.out.println("�̸� : ");
		String name = sc.nextLine(); //���߿� ���ڿ��� ������ ��ġ�ԵǸ� ������ ���� �ִµ� nextLine();�� ���� �ȳ�
		
		System.out.println("����⵵");
		String year_ = sc.nextLine();
		int year = Integer.parseInt(year_);
		
		year = 2021 - year + 1;
		
		System.out.println("�̸� : " + name + "���� : " + year);
		
	}

}
