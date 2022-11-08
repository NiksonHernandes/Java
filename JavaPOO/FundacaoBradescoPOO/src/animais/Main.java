package animais;

public class Main {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		c1.nome = "Jack";
		c1.comer(); //comer do Animal
		c1.enterrarOsso(); //enterrarOsso do Cachorro
		
		Galinha g1 = new Galinha();
		g1.comer(); //comer do Animal
		g1.voar(); //voar da Aves
		g1.bicar(); //bicar da Galinha
		

	}

}
