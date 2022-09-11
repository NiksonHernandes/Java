public class MaiorNumero {
	private int num1;
	private int num2;
	
	public void maior(int n1, int n2) {
		this.setNum1(n1);
		this.setNum2(n2);
		
		if(this.getNum1() > this.getNum2()) {
			System.out.println("O maior numero eh: " + this.getNum1());
		}else {
			System.out.println("O maior numero eh: " + this.getNum2());
		}
	}
	
	//setters
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 =  num2;
	}
	
	//getters
	public int getNum1() {
		return this.num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
}
