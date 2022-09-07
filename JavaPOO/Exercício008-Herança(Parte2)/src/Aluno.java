
public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	//método não pode ser sobreescrito por pagarMensalidade de Bolsista
	/*public final void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno do aluno " + this.getNome() + ".");
	}*/
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno do aluno " + this.getNome() + ".");
	}
	
	//setters
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//getters
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getCurso() {
		return this.curso;
	}
}
