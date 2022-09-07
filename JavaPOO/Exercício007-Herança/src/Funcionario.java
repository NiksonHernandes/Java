
public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho(){
		this.setTrabalhando(!this.getTrabalhando());
	}
	
	//setters
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	//getters
	public String getSetor() {
		return this.setor;
	}
	
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
}
