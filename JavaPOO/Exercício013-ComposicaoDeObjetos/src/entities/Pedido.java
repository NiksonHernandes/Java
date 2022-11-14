package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	//para formatação do date
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momentoPedido;
	private StatusPedido status;
	
	private Cliente cliente;
	
	private List<PedidoItem> itens = new ArrayList<>();
	
	public Pedido() {}

	//nao coloca a lista, pois já esta instanciada lá em cima.
	public Pedido(Date momentoPedido, StatusPedido status, Cliente cliente) {
		super();
		this.momentoPedido = momentoPedido;
		this.status = status;
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();//add e no final converte pra String
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momentoPedido) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente.toString() + "\n");
		sb.append("Pedidos:\n");
		for (PedidoItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	public void addItem(PedidoItem item) {
		itens.add(item);
	}
	
	public void removeItem(PedidoItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(PedidoItem x: itens) {//para cada elemento X da lista itens
			soma = soma + x.TotalPedido();
		}
		return soma;
	}
	
	public Date getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Date momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
