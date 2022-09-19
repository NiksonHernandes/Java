public class Main {

	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Tartaruga t = new Tartaruga();
		
		m.setPeso(12.2f);
		m.setCorPelo("MArrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		c.locomover();
		c.emitirSom();
		t.locomover();
		
	}
}
