package example01;

public class Ex05 {

	public static void main(String[] args) {

		String name = "�̼���";
		int salary = 300; //�޿�
		int bouns =salary * 50/100; //���ʽ� �޿��� 500%
		
		int yearTotal = salary * 12 + bouns;
		
//	    ����� �̸��� ???�̸� ����� �޿��� ???�̸� ����� ���ʽ��� ????�̸�, ����� ������ ???dlek
				
		System.out.println("����� �̸��� " + name + "�̸�, ����� �޿��� " + salary +"�̸�, ����� ���ʽ��� " + bouns +"�̸�, ����� ������ " + yearTotal +"�Դϴ�.");
		
		String msg = "";
		msg = msg + "����� �̸��� " +name + "�̸�,";
		msg = msg + "����� �޿����� " + salary + "�̸�,";
		msg = msg + "����� ���ʽ��� " + bouns + "�̸�,";
		msg = msg + "����� ������ " + yearTotal +"�Դϴ�.";
		
		System.out.println(msg);
		
	}

}
