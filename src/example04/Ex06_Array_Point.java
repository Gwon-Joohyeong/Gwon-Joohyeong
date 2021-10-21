package example04;

public class Ex06_Array_Point {

	public static void main(String[] args) {
	
		// 이름, 국어, 영어, 수학 점수를 담은 배열로 
		String[] names = {"ȫ�浿", "�̼���", "��õ��", "�̻��", "�����"};
		int[] kor={100, 90, 80, 70, 60};
		int[] eng= {88, 98, 78, 69, 65};
		int[] mat= {99, 88, 77, 66, 55};
		
		int[] tot = new int[names.length];
		double[] avg = new double[names.length];
		
		for(int i=0; i<names.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3;
			System.out.println(names[i] + kor[i] + eng[i] + mat[i] + tot[i] + avg[i] );
		}
		
		
	}

}
