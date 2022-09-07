
public class Main {

	public static void main(String[] args) {
		
		//exemplo de instancia de visitante
		/*Visitante v1 = new Visitante();
		
		v1.setNome("Joana");
		v1.setIdade(13);
		v1.setSexo("Feminino");
		System.out.println(v1.toString());*/
		
		//exemplo de instancia de aluno
		Aluno a1 = new Aluno();
		
		a1.setNome("Carlos");
		a1.setIdade(34);
		a1.setSexo("M");
		a1.setCurso("Informática");
		a1.setMatricula(3333);
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1111);
		b1.setNome("Ricardo");
		b1.setBolsa(2500);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		

	}

}
