package banco;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println("Cliente " + this.cliente + ", seu saldo eh: " + this.saldo );
	};
	
	void sacar(double valor) {
		this.saldo = this.saldo - valor;
		//this.saldo -= valor
	};
	
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
		//this.saldo += valor
	};
	
	void transferePara(Conta destino, double valor) {
		this.sacar(valor);//pegar o valor de this, seria c1 e saca
		destino.deposita(valor);//deposita em c2 o valor que pegou dwe c1
	};
	
}
