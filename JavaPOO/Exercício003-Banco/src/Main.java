
public class Main {

	public static void main(String[] args) {
		Banco c1 = new Banco();
		
		c1.setnumConta(2817);
		c1.setNome("Ricardo Julios Pereira");
		
		c1.abrirConta("CC");
		c1.depositar(100);
		
		c1.sacar(150);
		c1.fecharConta();
		
		Banco c2 = new Banco();
		
		c2.setnumConta(5433);
		c2.setNome("Jorgina Apareceida Guimarães");
		
		c2.abrirConta("CP");
		c2.depositar(500);
		c2.sacar(100);
		
		c1.consultar();
		c2.consultar();
	}

}
