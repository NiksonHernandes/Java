public class ProjetoCaneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.cor = "Vermelha";
		c1.modelo = "Spider";
		c1.ponta = 0.7f;
		c1.tampa = false; 
		c1.carga = 95;
		
		c1.tampar();
		c1.destampar();
		
		c1.status();
		c1.rabiscar();

	}

}
