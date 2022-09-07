
public class Aluno extends Pessoa{
	
	private int matr;
	private String curso;
	
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada!");
	}
	
	//setters
	public void setMatr(int matr) {
		this.matr = matr;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//getters
	public int getMatr() {
		return this.matr;
	}
	
	public String getCurso() {
		return this.curso;
	}
}
