package example02;

public class Ex05_Increase {

	public static void main(String[] args) {
	
		int i=5;
		int j=0;
		
		j=i++; //
		System.out.println(j +", " + i);
		
		i=5;
		j=++i;
		System.out.println(j +", " + i);
		
		i--;
		System.out.println(i);
		
		--i;
		System.out.println(i);
	}

}
