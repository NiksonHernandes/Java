
public abstract class  Animal {
	protected float peso;
	protected int idade;
	protected int membros;
	
	//metodo abstrato
	public abstract void emitirSom();
	
	public abstract void escreva(String txt);

	//Setters e getters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}
	
}
