package matematica;

public class Matematica {
	
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else{
			return dois;
		}
	}
	
	int raiz(int numero) {
		return (int) Math.sqrt(numero);
	}
	
	String romanos(int numeros) {
		return "OK";
	}
	
	double soma(double um, double dois) {
		return um + dois;
	}

}
