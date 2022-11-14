package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	//para formatação do date
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataNascimento;
	
	public Cliente() {}

	public Cliente(String nome, String email, Date dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " (" + sdf.format(dataNascimento) + ") - " + this.getEmail();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
