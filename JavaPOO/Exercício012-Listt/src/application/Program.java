package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //coloca o ponto como separador de decimais 
		Scanner entradaDados = new Scanner(System.in); 
		
		List<Funcionario> list = new ArrayList<>();
		 
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = entradaDados.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer id = entradaDados.nextInt();
			while(procuraId(list, id) == true) {
				System.out.println("ID ja existe! Digite novamente: ");
				id = entradaDados.nextInt();
			}

			System.out.print("Nome: ");
			entradaDados.nextLine(); //para limpar o buffer
			String nome = entradaDados.nextLine(); //ler até a quebra de linhas
			System.out.print("Salario: ");
			Double salario = entradaDados.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			list.add(func);//adiciona na lista
			System.out.println("#### Funcionario " + nome + " adicionado na lista ####" );
		}
		
		System.out.println();
		System.out.print("Informe o ID do funcioario que voce quer incrementar o salario: ");
		int idIncrementa = entradaDados.nextInt();
		
		
		//PERCORRER COM MAP 
		Funcionario pos = list.stream().filter(x -> x.getId() == idIncrementa).findFirst().orElse(null);
			
		//PERCORRENDO MANUALMENTE A LISTA 
		//Integer pos = procuraPosicaoID(list, idIncrementa);
			
		if(pos == null) {
			System.out.println("Id nao encontrado na lista");
	
		}else {
			System.out.println("Entre com a porcentagem de aumento: ");
			Double perc = entradaDados.nextDouble();
			//list.get(pos).aumentaSalario(perc);
			pos.aumentaSalario(perc);
			
		}
				
		System.out.println();
		System.out.println("Lista de funcionarios:");
		for(Funcionario emp : list) {
			System.out.println(emp.toString());
		}
		
		entradaDados.close();
	}
	
	
	//tem q ser static pq meu main é static
	private static Integer procuraPosicaoID(List<Funcionario> list, int id) {//recebe uma lista e um id
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id)  {//get é uma função que pega o elemento na posição 
				return i;//retorna a posição dele
			}	 
		}
		return null;//não encontrado
	}
	
	private static boolean procuraId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			return false; 
		}
		return true;
		
	}

}
