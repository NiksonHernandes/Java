public class NumeroDecrescente {
	private int num;
	
	public void decrescente(int numero) {
		this.setNum(numero);
		
		for(int x = this.getNum(); x >= 0; x--) {
			System.out.println(x);
		}
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
}
