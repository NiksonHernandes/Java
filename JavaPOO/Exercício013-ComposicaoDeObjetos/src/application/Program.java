package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para formatação do date	
		
		Locale.setDefault(Locale.US);//substitui a vírgula por ponto
		Scanner entradaDados = new Scanner(System.in);
		
		/*Produto p = new Produto("TV", 1000.0);
		
		PedidoItem pi1 = new PedidoItem(1, 1000.0, p); //p é o produto associado a ele
		System.out.println(pi1.toString());*/
		
		System.out.println("ENTRE COM OS DADOS DO CLIENTE:");
		System.out.print("Nome: ");
		String name = entradaDados.nextLine();
		System.out.print("Email: ");
		String email = entradaDados.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = (Date) sdf.parse(entradaDados.next());
		
		Cliente cliente = new Cliente(name, email, birthDate);
		
		System.out.println("ENTRE COM O STATUS DO PEDIDO:");
		System.out.print("Status: ");
		//String StatusString  = entradaDados.next();
		StatusPedido status = StatusPedido.valueOf(entradaDados.next());//valueOf para converter o string digitado para o valor definido no StatusPedido, ouseja, algum determinado lpa
		
		Pedido pedido = new Pedido(new Date(0), status, cliente); //pedido associado ao cliente
		
		System.out.print("Quantos itens o pedidos terá? ");
		int n = entradaDados.nextInt();
		for(int i=0; i<n; i++) {
			
			System.out.println("ENTRE COM OS DADOS DO ITEM #" + (i+1) + ":");
			System.out.print("Nome do produto: ");
			entradaDados.nextLine(); //limpar o buffer
			String nomeProduto = entradaDados.nextLine();
			System.out.print("Preco do produto: ");
			double precoProduto = entradaDados.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = entradaDados.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			PedidoItem it = new PedidoItem(quantidade, precoProduto, produto);
			
			pedido.addItem(it);//adicionar o item ao pedido
		}

		System.out.println();
		System.out.println(pedido.toString());
		entradaDados.close();
	}
}
