public abstract class Pessoa {
	protected String nome; //Protected -> na classe Bolsista no método renovarBolsa, posso usar o this.nome ao inivés de this.getNome()
	private int idade;
	private String sexo;
	
	@Override
	public String toString() {
		return "Dados da Pessoa [nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + "]";
	}

	public final void fezerAniversario() {
		
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSexo() {
		return this.sexo;
	}
}
