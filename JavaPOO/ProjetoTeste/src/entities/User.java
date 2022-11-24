package entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long id;
	private String nome;
	private String username;
	private String password;
	private String email;
	
	private List<IdCarro> idCarros = new ArrayList<>();
	
	public User(Long id, String nome, String username, String password, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();//add e no final converte pra String
		sb.append("id: ");
		sb.append(this.getId() + "\n");
		sb.append("Nome: ");
		sb.append(this.getNome()+ "\n");
		sb.append("Username: ");
		sb.append(this.getUsername() + "\n");
		sb.append("Password: ");
		sb.append(this.getPassword() + "\n");
		sb.append("Email: ");
		sb.append(this.getEmail() + "\n");
		sb.append("Id Lista de Carros:\n");
		for (IdCarro item : idCarros) {
			sb.append(item.getId() + "\n");
		}
		sb.append("Dados da lista de carro: ");
		sb.append(idCarros.toString() + "\n");
		return sb.toString();
	}

	public void addId(IdCarro idCarro) {
		idCarros.add(idCarro);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
