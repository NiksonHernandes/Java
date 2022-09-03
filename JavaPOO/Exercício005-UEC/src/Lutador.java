public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//construtor 
	public Lutador(String nome, String nacionalidade, int idade, float altura, 
					float peso, int vitorias, int derrotas, int empates) {
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	public void apresentar() {
		
		System.out.println("---------------------------");
		System.out.println("Nome do lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos de idade");
		System.out.println(this.getAltura() + " m de altura");
		System.out.println("Peso: " + this.getPeso() + "Kg");
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());	
		System.out.println("---------------------------");
	}
	
	public void status() {
		
		System.out.println("----------STATUS----------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("---------------------------------");
	}
	
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
	//settres
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	private void setCategoria() {
		
		if(this.getPeso() < 52.2) {
			this.categoria = "Inválido";
			
		}else if(this.getPeso() <= 70.3) {
			this.categoria = "Peso Leve";
			
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "Peso Médio";
			
		}else if(this.getPeso() <= 120.2) {
			this.categoria = "Peso Pesado";
			
		}else {
			this.categoria = "Inválido";
		}
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public int getEmpates() {
		return this.empates;
	}
		
}


