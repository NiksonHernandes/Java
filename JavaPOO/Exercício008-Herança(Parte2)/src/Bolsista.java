
public class Bolsista extends Aluno{
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do aluno " + this.nome);
	}
	
	@Override //sobre põe o pagarMensalidade do método na classe aluno;
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
	}
	
	//setter
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	//getters
	public int getBolsa() {
		return this.bolsa;
	}
}
