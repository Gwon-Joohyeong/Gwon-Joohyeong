package example02;

public class Ex04_Casting {

	public static void main(String[] args) {
		
		float f = 1.6F;
		System.out.println(f);
		
		f=100; //�������� �Ǽ������� �ڵ�����ȯ �ȴ�.
		
		System.out.println(f);
		
		f = 100.5F;
		int i = (int)f;//�Ǽ����� ���������� ��������ȯ. casting�̶�� �Ѵ�. 
		System.out.println(i);
		
		i = 5000;
		
		byte b =(byte)i;// ��ƮŸ�� i�� byte���� ���� ũ�� ��������ȯ�ؼ� �����ض�
		System.out.println(i);
	}

}
