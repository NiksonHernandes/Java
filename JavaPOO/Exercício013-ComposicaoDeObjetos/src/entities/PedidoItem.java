package entities;

public class PedidoItem {
	private Integer quantidade;
	private double preco;
	private Produto produto;
	
	public PedidoItem() {}
	
	public PedidoItem(Integer quantidade, double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return this.getProduto().getNome() 
				+ ", $" 
				+ String.format("%.2f", this.getPreco()) 
				+ ", Quantidade: " 
				+ this.getQuantidade() 
				+ ", Total do pedido: $"
				+ String.format("%.2f", this.TotalPedido()); 
				
	}

	public double TotalPedido() {	
		return this.getPreco() * this.getQuantidade();
		
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
