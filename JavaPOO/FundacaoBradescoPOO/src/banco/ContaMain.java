package banco;

public class ContaMain {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.cliente = "Joao Paulo";
		c1.saldo = 4_000.00;
		c1.exibeSaldo();
		
//		c1.sacar(2000);
//		c1.exibeSaldo();
//
//		
//		c1.deposita(3000);
//		c1.exibeSaldo();
		
		Conta c2 = new Conta();
		c2.cliente = "Ricardo";
		c2.saldo = 5_000.00;
		
		
		c1.transferePara(c2, 2000);
		c2.exibeSaldo();
	}

}
