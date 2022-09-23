package projeto.youtube;

public class Gafanhoto extends Pessoa{
	
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) { //Construtor
		super(nome, idade, sexo); //chama o construtor da super mãe
		this.login = login;
		this.totAssistido = 0;
	}
	
	@Override //sobrescrever toString da mãe 
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
	}//chama o toString do super -> superclasse, mae 

	public void viuMaisUm() {
		
	}
	
	//gertters e setters	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
}
