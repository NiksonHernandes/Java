
public class Cachorro extends Lobo{
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	@Override 
	public void escreva(String txt) {
		System.out.println(txt);
	}
	
	//Polimorfismo de sobrecarga com o método reagir
	
	public void reagir(String frase) {
		if(frase.equals("toma comida") || frase.equals("Ola")) { //como frase é do obj da classe String é melhor usar equals para comparar
			System.out.println("Abanar e Latir");
		}else {
			System.out.println("Rosnar");
			this.escreva("Rosnar com txt de aisdjiasjd");//teste de escreva com sobreposição
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanar");
		}else if(hora >=18) {
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar e latir");
		}
	}
	 
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar!");
		}else {
			System.out.println("Rosnar e latir");
			this.emitirSom();
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
		}else {
			if(peso > 10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
		}
	}
}
