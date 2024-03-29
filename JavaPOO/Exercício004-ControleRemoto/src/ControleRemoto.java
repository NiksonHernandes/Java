public class ControleRemoto implements Controlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		setVolume(50);
		setLigado(false);
		setTocando(false);
	}
	
	//métodos acessores
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//metodos abstratos

	@Override  //sobrescrever o métodos que esta na interface 
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);		
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado() == true) {
			System.out.println("----MENU----\n" + "Está ligada? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume() + " ");
			
			for(int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print("<>");
			}
		}else {
			System.out.println("Televisão desligada!");
		}
		
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("\nFechando menu...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() + 5);
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() - 5);
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() == true && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigado() == true && this.getTocando()) {
			this.setTocando(false);
		}
		
	} 
	
	
}
