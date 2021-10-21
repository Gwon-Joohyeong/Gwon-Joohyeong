package example01;

public class Ex05 {

	public static void main(String[] args) {

		String name = "이성순";
		int salary = 300; //급여
		int bouns =salary * 50/100; //보너스 급여의 500%
		
		int yearTotal = salary * 12 + bouns;
		
//	    당신의 이름은 ???이며 당신의 급여는 ???이며 당신의 보너스는 ????이며, 당신의 연봉은 ???dlek
				
		System.out.println("당신의 이름은 " + name + "이며, 당신의 급여는 " + salary +"이며, 당신의 보너스는 " + bouns +"이며, 당신의 연봉은 " + yearTotal +"입니다.");
		
		String msg = "";
		msg = msg + "당신의 이름은 " +name + "이며,";
		msg = msg + "당신의 급여는은 " + salary + "이며,";
		msg = msg + "당신의 보너스는 " + bouns + "이며,";
		msg = msg + "당신의 연봉은 " + yearTotal +"입니다.";
		
		System.out.println(msg);
		
	}

}
