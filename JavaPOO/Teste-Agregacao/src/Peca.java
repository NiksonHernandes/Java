public class Peca {
	private int numero;
	private String nome;
	private String especificacao;
	
	public Peca(int numero, String nome, String especificacao) {
		this.setNumero(numero);
		this.setNome(nome);
		this.setEspecificacao(especificacao);
	}	
	
	
	public String descricao() {
		return "Peca [numero = " + this.getNumero() + ", nome = " + this.getNome() + 
				", especificacao = " + this.getEspecificacao() + "]";
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	} 
	
	
}
