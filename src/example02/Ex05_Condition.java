package example02;

public class Ex05_Condition {

	public static void main(String[] args) {
		
		int num = 5;
		int result = num > 0 ? 10 :1;
		System.out.println(result);
		
//		���� ? ������ ���� ��� : ������ ������ ���
		
		int msg;
		if (num>0) {
			msg = 10;
		} else {
			msg=1;
		}
		System.out.println(msg);
	}

}
