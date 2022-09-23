package projeto.youtube;

public class Main {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Sabatina");
		v[1] = new Video("Cosutureira");
		v[2] = new Video("Limbo");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Paulo", 12, "M", "joao");
		g[1] = new Gafanhoto("Julia", 32, "F", "juju!");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar(37.0f);
		System.out.println(vis[1].toString());
		
		
		/*
		System.out.println("VIDEOS\n----------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("\nGAFANHOTOS\n---------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());*/
	}

}
