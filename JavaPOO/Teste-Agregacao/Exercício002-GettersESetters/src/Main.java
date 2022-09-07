
public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("SAND", "VERMELHA", 0.4f);

		// c1.setCor("BLUE");
		// c1.setMoldelo("JUBARTE");
		// c1.setTampada(true);

		c1.status();
		// System.out.println("Cor: " + c1.getCor() + "\nModelo: " + c1.getModelo());

		Caneta c2 = new Caneta("DODUI", "LARANJA", 1.5f);
		c2.status();
	}
}
