package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {} //Constructor default

	public Funcionario(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentaSalario(double porcentagem) {
		//double conversao = (porcentagem / 100);
		//this.setSalario(this.getSalario() * conversao); 	
		this.setSalario(salario += salario * porcentagem / 100);
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
