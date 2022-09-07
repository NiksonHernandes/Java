public class Equipamento {
	
	private int codigo;
	private String descricao;
	private double preco;
	private Peca peca;
	
	public Equipamento(int codigo, String desricao, double preco, Peca p1) {
		this.setCodigo(codigo);
		this.setDescricao(desricao);
		this.setPreco(preco);
		this.setPeca(p1);
	}
	
	public String descEqui(){
		return "Equipamento [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", "
				+ "peca=" + peca.descricao() + "]";
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}	
	
}
