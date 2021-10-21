package example03;

public class Ex01 {

	public static void main(String[] args) {

		int a =5;
		
//		String result;
//		if(a%2 ==0) { //a 나머지 2로 나눴을 때 몫이 0이여야 한다.
//			result= "짝수";
//		} else {
//			result= "홀수";
//		}
		
		String result ="짝수";
	if(a%2 != 0) {
		result = "홀수";
	}
	System.out.println(a + "==>" + result);
	}

}
