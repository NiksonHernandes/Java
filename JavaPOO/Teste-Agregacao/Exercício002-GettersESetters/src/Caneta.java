public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;

	/*
	 * Para criar Get e Set rapidos: Seleciona os atributos e aperte ctrl + 3 vá na
	 * opção: Generate Getters ans Setters
	 */

	// CONSTRUTOR
	public Caneta(String modelo, String cor, float ponta) {// -> mesmo nome da classe - executa tarefas assim que o
															// objeto for iniciado
		this.tampar();
		this.cor = cor; // ou this.setCor(cor)
		this.setMoldelo(modelo);
		this.ponta = ponta;

	}

	// METODOS
	public void status() { // método Status
		System.out.println("Cor: " + this.getCor() + "\nModelo: " + this.getModelo() + "\nPonta: " + this.getPonta()
				+ "\nCarga: " + this.getCarga() + "\nTampada? " + this.getTampada());
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	// SETTERS
	public void setMoldelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	// GETTERS
	public String getModelo() {
		return this.modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public float getPonta() {
		return this.ponta;
	}

	public int getCarga() {
		return this.carga;
	}

	public boolean getTampada() {
		return this.tampada;
	}

}
