public class Caneta {
	
	String modelo; 
	String cor;
	float ponta; 
	int carga;
	boolean tampa;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%" );
		
		if(this.tampa == true) {
			System.out.println("A caneta esta TAMPADA");
		}else {
			System.out.println("A caneta esta DESTAMPADA");
		}
	}
	
	void rabiscar() {
		if(this.tampa == true) {
			System.out.println("ERRO! Não foi possível rabiscar");
		}else {
			System.out.println("Rabiscando");
		}
	}
	
	void tampar() {
		this.tampa = true;
	}
	
	void destampar() {
		this.tampa = false;
	}
	
	
	
}
