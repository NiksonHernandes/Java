package projeto.youtube;

public class Main {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Sabatina");
		v[1] = new Video("Cosutureira");
		v[2] = new Video("Limbo");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Paulo", 12, "M", "jaosd@ff");
		g[1] = new Gafanhoto("Julia", 32, "F", "juju!");
		
		
		System.out.println(v[0].toString());
		System.out.println(g[0].toString());
	}

}
