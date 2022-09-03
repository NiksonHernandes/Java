import java.util.Random;

public class Luta {
	private Lutador desafiado; //Instancia de outra classe -  Lutador é um tipo abstrato 
	private Lutador desafiante; //Instanciad e outra classe
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if((l1.getCategoria().equals(l2.getCategoria())) && (l1.getNome() != l2.getNome())) {
			
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);	
			System.out.println("Luta Aprovada\n");
		}else {
			
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("Luta Desaprovada\n");
		}
	}
	
	public void lutar() {
		
		if(this.getAprovada()) {
			
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();

			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 ou 2
			
			switch(vencedor) {
				case 0: //Empate
					System.out.println("## Empatou ##");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					
					break;	
				case 1: //Ganha
					System.out.println("Vencedor: " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();					
					
					break;
				case 2: //Perde
					System.out.println("Vencedor: " + this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					
					break;
			}	
		}else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	
	//setters
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//getters
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public boolean getAprovada() {
		return this.aprovada;
	}
	
}
