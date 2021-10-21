package my;

public class Array_성적 {

	public static void main(String[] args) {
		// 성적이랑 얼마나 반복될지의 반복문이 필요하다
		
		String[] names = {"가가가", "나나나", "다다다", "라라라", "마마마"};
		int[] kor = {90, 88, 77, 89, 76};
		int[] eng = {88, 77, 99, 85, 96};
		int[] mat = {90, 89, 75, 84, 91};
		
		int[] tot= new int[names.length];
		double[] avg = new double[names.length];
		
		for(int i =0; i<names.length; i++) {
			tot[i]= kor[i] + eng[i] + mat[i];
			avg[i]= tot[i]/3;
			System.out.println(names[i] + "\t" +  kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
		
	}

}
