public class Main {

	public static void main(String[] args) {
		Peca p[] = new Peca[3]; 
		Equipamento e[] = new Equipamento[2];
		
		p[0] = new Peca(1674, "Memória RAM", "memória que vai dentro do PC");
		p[1] = new Peca(1332, "HD", "usado para armazenar os dados");
		p[2] = new Peca(8875, "Teclado", "teclado para digitar");
		
		System.out.println(p[0].descricao());
		System.out.println(p[1].descricao());
		
		
		e[0] = new Equipamento(7774, "Aparelho de Raio-X", 593.5f, p[0]);
		
		System.out.println(e[0].descEqui());

	}

}
