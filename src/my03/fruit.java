package my03;

public class fruit {

	String name;
	int price;
	int count;
	int totalMoney;
	
	public fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public fruit(String name, int price, int count, int totalMoney) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.totalMoney = totalMoney;
	}

	public void total() {
		System.out.println("제품이름 : " + name + "\t" + "제품수량 : " + count + "\t" + "제품가격 : " + price);
		
	}
	public void totalMoney() {
		totalMoney = price*count;
	}



	
}
