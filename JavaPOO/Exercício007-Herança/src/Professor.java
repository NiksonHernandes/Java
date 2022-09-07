
public class Professor extends Pessoa{
	
	private String especialidade;
	private float salario;
	
	public void receberAum(float n) {
		this.setSalario(this.getSalario() + n);
	}
	
	//setters
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//getters
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public float getSalario() {
		return this.salario;
	}
}
