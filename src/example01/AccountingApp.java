package example01;
class Accounting{
	public  static double valueOfSupply; 
	public static  double vatRate = 0.1;
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public double  getVAT () {
		 return valueOfSupply * vatRate;
	 }
	 public double getTotal() {
		 return valueOfSupply + getVAT();
	 }
	 }
	public class AccountingApp {
		public static void main(String[] args) {
			Accounting a1 = new Accounting(10000.0) ; //인스턴스화 됨.
//			a1. valueOfSupply = new 10000.0; 
			
			Accounting a2 = new Accounting(20000.0) ; 
//			a2. valueOfSupply = 20000.0; 
			
			System.out.println("value of supply : " + a1.valueOfSupply );
			System.out.println("value of supply : " + a2.valueOfSupply );
			
			System.out.println("VAT : " + a1.getVAT()); // 만원에 대한 부가가치세
			System.out.println("VAT : " + a2.getVAT()); // 만원에 대한 부가가치세
			
			System.out.println("Total : " + a1.getTotal());
			System.out.println("Total : " + a2.getTotal());
			
/*			Accounting.valueOfSupply = 10000.0; 
			System.out.println("value of supply : " + Accounting.valueOfSupply );
			System.out.println("VAT : " + Accounting.getVAT()); // 만원에 대한 부가가치세
			System.out.println("Total : " + Accounting.getTotal());
*/				
	}
}