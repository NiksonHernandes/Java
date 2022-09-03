public class Banco {

	public int numConta;
	protected String tipoConta; // CC = Conta Corrente ->começa com 50 ou CP = Conta Poupança -> começa com 150
	private String nome;
	private float saldoConta;
	private boolean statusConta; // aberta = true ou fechada = false

	// CONSTRUTOR
	public Banco() {
		// status falso = fechada
		// saldo = 0
		//this.statusConta = false;
		this.setStatusConta(false);
		this.saldoConta = 0f;

	}

	// METODODS
	public void consultar() {
		System.out.println("-----------------------------------");
		System.out.println("Nome do Usuário: " + this.getNome() + "\nTipo de conta: " + this.getTipoConta()
				+ "\nNúmero da Conta: " + this.getNumConta() + "\nSaldo da Conta: R$ " + this.getSaldoConta() + " reais"
				+ "\nStatus da Conta: " + this.getStatusConta() + "\n");
	}

	public void abrirConta(String tipo) {
		if (this.getStatusConta() == true) {
			System.out.println("\nCONTA JÁ EXISTE!!\n");

		} else {
			this.setStatusConta(true);
			this.setTipoConta(tipo);
			System.out.println("CONTA ABERTA COM SUCESSO!\n");

			if (this.getTipoConta() == "CC" || this.getTipoConta() == "cc") {
				//this.saldoConta = saldoConta + 50;
				this.setSaldoConta(50);

			} else if (this.getTipoConta() == "CP" || this.getTipoConta() == "cp") {
				this.setSaldoConta(150);
			}
		}
	}

	public void fecharConta() {
		// só fecha se n tiver devendo nada e não tiver dinheiro na conta
		if (this.getStatusConta() == true) {
			if(this.getSaldoConta() > 0) {
				System.out.println("Conta não pode ser fechada, pois ainda tem saldo POSITIVO!");
			
			}else if(this.getSaldoConta() < 0) {
				System.out.println("Conta não pode ser fechada, pois o saldo esta NEGATIVO!");
			}else {
				this.setStatusConta(false);
				this.setNome("");
				this.setnumConta(0);
				this.setTipoConta("");
				System.out.println("Conta fechada com sucesso!");	
			}				
		}else {
			System.out.println("CONTA INEXISTENTE!\n");
		}
	}

	public void depositar(float valor) {
		if (this.getStatusConta() == true) {
			//this.saldoConta = saldoConta + valor; ou 
			this.setSaldoConta(this.getSaldoConta() + valor); //pegue o saldo atual + valor
			System.out.println("\nQuantidade depositada: " + valor + " reais\nNa conta de: " + this.getNome() + "\n");

		} else {
			System.out.println("\nERRO! Conta não existe.\nAbra uma conta antes de depositar o saldo.\n");

		}
	}

	public void sacar(float valor) {
		if (this.getStatusConta() == true) {
			if(this.getSaldoConta() >= valor) {
				//this.saldoConta = saldoConta - valor;
				this.setSaldoConta(this.getSaldoConta() - valor);
				System.out.println("\nQuantidade sacada: " +  valor + " reais\nNa conta de: " + this.getNome() + "\n");
				
			}else {
				System.out.println("\nSALDO INSUFICIENTE!\n");

			} 
		}else {
			System.out.println("\nConta inexistente!\n");
		}
	}

	public void pagarMensalidade() {
		// Conta Corrente paga 12 reais
		// Conta Poupança 20 reais
		if (this.getStatusConta() == true) {
			if (this.getTipoConta() == "CC" || this.getTipoConta() == "cc") {
				this.saldoConta = this.saldoConta - 12;

			} else if (this.getTipoConta() == "CP" || this.getTipoConta() == "cp") {
				this.saldoConta = this.saldoConta - 20;
			}

		} else {
			System.out.println("NÃO FOI POSSÍVEL PAGAR MENSALIDADE.\nCONTA INEXISTENTE!");
		}
	}

	// SETTERS
	public void setnumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}

	// GETTERS
	public int getNumConta() {
		return this.numConta;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public String getNome() {
		return this.nome;
	}

	public float getSaldoConta() {
		return this.saldoConta;
	}

	public boolean getStatusConta() {
		return this.statusConta;
	}
}
